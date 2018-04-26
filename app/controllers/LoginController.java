package controller;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.inject.Inject;

import view.html.*;
import models.users.*;

public class LoginController extends Controller {



    private FormFactory formFactory;

    private Environment env;


    @inject
    public LoginController(Environment e, FormFactory f){
        this.env =e;
        this.formFactory = f;
    }
public Result login(){

   // Form<Login> loginForm =form factory.form(Login.class);

    return ok(login.render(loginForm));
}
public Result loginSubmit(){

    
}