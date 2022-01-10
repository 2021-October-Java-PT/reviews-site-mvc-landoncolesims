package org.wecancoeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewsController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/review")
    public String findOneReview(@RequestParam(value = "id") Long id, Model model) {
        model.addAttribute("reviewModel", reviewRepo.findOne(id));
        return "ReviewTemplate";
    }

    @RequestMapping("/reviews")
    public String findAllReviews(Model model) {
        model.addAttribute("reviewsModel", reviewRepo.findAll());
        return "ReviewsTemplate";
    }


}