package com.jobapp.JobApplicationPortal.Review;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies/{companyId}")
public class ReviewController {

    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }


    @GetMapping("/review")
    public ResponseEntity<List<Review>> getReviewByCompanyId(@PathVariable Long companyId){
        List<Review> reviewList = reviewService.getReviewsByCompanyId(companyId);
        if(reviewList!= null){
            return new ResponseEntity<>(reviewList, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @PostMapping("/review")
    public ResponseEntity<String> createReview(@PathVariable Long companyId, @RequestBody Review review){
        boolean createdReview = reviewService.createReview(companyId, review);

        if(createdReview){
            return new ResponseEntity<>("New Review is Added", HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PutMapping("/review/{reviewId}")
    public ResponseEntity<String> updateReview(@PathVariable Long companyId, @RequestBody Review review, @PathVariable Long reviewId){
        boolean updatedReview = reviewService.updateReview(companyId, review, reviewId);
        if(updatedReview){
            return new ResponseEntity<>("Review is updated..", HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @GetMapping("/review/{reviewId}")
    public ResponseEntity<Review> getReviewByACompany(@PathVariable Long reviewId, @PathVariable Long companyId){

        Review review = reviewService.getSingleReviewForACompany(reviewId, companyId);
        if(review != null){
            return new ResponseEntity<>(review, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/review/{reviewId}")
    public ResponseEntity<String> deleteReview(@PathVariable Long companyId, @PathVariable Long reviewId){
        boolean isDeleted = reviewService.deleteReviewByCompanyIdByReviewId(companyId, reviewId);

        if(isDeleted){
            return new ResponseEntity<>("Review has been deleted", HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



}
