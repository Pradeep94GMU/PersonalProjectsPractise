package com.jobapp.JobApplicationPortal.Review;

import com.jobapp.JobApplicationPortal.Company.Company;
import com.jobapp.JobApplicationPortal.Company.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServImplementation implements ReviewService{

    @Autowired
    ReviewRepo reviewRepo;

    @Autowired
    CompanyRepo companyRepo;

    public ReviewServImplementation(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

    public ReviewServImplementation(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    public ReviewServImplementation() {
    }

    @Override
    public List<Review> getReviewsByCompanyId(Long id) {

       //i hve a company id: find company
        Company company = companyRepo.findById(id).orElse(null);

        if(company != null){
            return company.getReviewList();
        }
       return null;

    }

    @Override
    public boolean createReview(Long id, Review review) {
        //find Company
        Company company = companyRepo.findById(id).orElse(null);
        if(company != null){
            review.setCompany(company);
            reviewRepo.save(review);
            return true;
        }

        return false;
    }

    @Override
    public boolean updateReview(Long companyId, Review review, Long reviewId) {

        //find company
        Company company = companyRepo.findById(companyId).orElse(null);
        Review reviewOld = reviewRepo.findById(reviewId).orElse(null);



       try{
           if(company != null){
               //set company to review and then save it
               reviewOld.setCompany(company);
               reviewOld.setRating(review.getRating());
               reviewOld.setDescription(review.getDescription());
               reviewOld.setTitle(review.getTitle());
               reviewRepo.save(reviewOld);
               return true;
           }
       }catch(Exception e){
           return false;
       }

        return false;
    }

    @Override
    public Review getSingleReviewForACompany(Long reviewId, Long companyId) {

//        //find company first
//        Company company = companyRepo.findById(companyId).orElse(null);
//
//        //find review
//        Review review = reviewRepo.findById(reviewId).orElse(null);
//
//        if(company != null && review != null){
//            return review;
//
//        }
//        return null;


        //get all the review and then filter with individual reviewId
       List<Review> reviewList = getReviewsByCompanyId(companyId); //this will give all google review

        //now i need to filter this review list based on my reviewId
       if(reviewList != null){
           for(Review review: reviewList){
               if(review.getId().equals(reviewId)){
                   return review;
               }
           }
       }
        return null;
    }

    @Override
    public boolean deleteReviewByCompanyIdByReviewId(Long companyId, Long reviewId) {

        //find all review of a company
        List<Review> reviewList = getReviewsByCompanyId(companyId);

       if(reviewList != null){
           for(Review review: reviewList){
               if(review.getId().equals(reviewId)){
                   reviewList.remove(review); //this is temp, which is not required , can directly delete from repo
                   reviewRepo.delete(review);
                   return true;
               }
           }
       }
        return false;
    }


}
