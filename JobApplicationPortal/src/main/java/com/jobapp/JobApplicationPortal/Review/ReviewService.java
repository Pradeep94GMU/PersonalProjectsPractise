package com.jobapp.JobApplicationPortal.Review;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {


    List<Review> getReviewsByCompanyId(Long id);

    boolean createReview(Long id, Review review);

    boolean updateReview(Long companyId, Review review, Long reviewId);

    Review getSingleReviewForACompany(Long reviewId, Long companyId);

    boolean deleteReviewByCompanyIdByReviewId(Long companyId, Long reviewId);
}
