package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render("you are welcome"));
    }

    public Result about() {
        return ok(views.html.about.render("About Us"));
    }

    
    public Result donation() {
        return ok(views.html.donation.render("Donation"));
    }

    public Result membership() {
        return ok(views.html.membership.render("Membership"));
    }
    public Result bookscategory() {
        return ok(views.html.bookscategory.render("Books category"));
    }


    public Result playtime() {
        return ok(views.html.playtime.render("Play Time "));
    }

    public Result morenike() {
        return ok(views.html.morenike.render("Morenike"));
    }
    public Result contact() {
        return ok(views.html.contact.render("Contact Us"));
    }
    public Result requestforbooks() {
        return ok(views.html.requestforbooks.render("Request For Books"));
    }

}
