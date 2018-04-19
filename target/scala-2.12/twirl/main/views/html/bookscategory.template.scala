
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object bookscategory extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/(""" 
 
"""),_display_(/*3.2*/main("Books Category")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
  """),format.raw/*4.3*/("""<!DOCTYPE html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href=""""),_display_(/*12.35*/routes/*12.41*/.Assets.versioned("stylesheets/books.css")),format.raw/*12.83*/("""">
  </head>
    
         
   
    
                             
                    <main>
                
    
                         
                           
                  
 <h2>Register today to be a member</h2>
    <form action="/action_page.php">
      <div class="form-group">
     <div class="col-xs-4">
        <label for="email">Email address:</label>
        <input type="email" class="form-control" id="email">
      </div>
     <div class="col-xs-4">
        <label for="pwd">Password:</label>
        <input type="password" class="form-control" id="pwd">
      </div>
      </div>
      <div class="checkbox">
        <label><input type="checkbox"> Remember me</label>
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form> 
                  <div class="links">
                      <ul>
                     <li><a href="https://nmaahc.si.edu/" target="_blank">Explore History</a> </li>
                      <li><a href=""""),_display_(/*45.37*/routes/*45.43*/.HomeController.requestforbooks()),format.raw/*45.76*/("""">Request For Books</a> </li>
                       <li><a href=""""),_display_(/*46.38*/routes/*46.44*/.HomeController.morenike),format.raw/*46.68*/("""'s Corner()">Morenikes' Corner</a> </li>
                        </ul>  
                        </div>
                
            <div class="page-header">
    <h1>Choose book type and age category</h1>    
      <h3>Please tick appropriate age group:</h3>
      <ul class="col-xs-1"> 
    <button type="button" class="btn btn-primary btn-block">sports </button>
    <button type="button" class="btn btn-primary btn-block">fictions</button>
    <button type="button" class="btn btn-primary btn-block">non-fictions</button>		
    <button type="button" class="btn btn-primary btn-block">educational</button>
    </ul>
      <div class="btn-group btn-group-justified dropup">
      <button type="button" class="btn btn-primary">Types</button>
        <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" data-toggle="dropdown">Make Selection(s)
        <span class="caret"></span></button>
        <ul class="dropdown-menu dropdown-menu-right" role="menu">
          <li><input type="checkbox" value=""><a href="#"><dd>sports </dd></a></li>
          <li><input type="checkbox" value=""><a href="#"><dd>fictions</dd></a></li>
          <li><input type="checkbox" value=""><a href="#"><dd>non-fictions</dd></a></li>			
          <li><input type="checkbox" value=""><a href="#"><dd>educational</dd></a></li>	
                 </ul>
            
         </div>
        <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#">Select Quantity needed</a></li>
        
        <div class="checkbox">
      <label><input type="checkbox" value=""><a href="#">12</a></label>
    </div>
    <div class="checkbox">
      <label><input type="checkbox" value=""><a href="#">24</a></label>
    </div>
    <div class="checkbox">
      <label><input type="checkbox" value=""><a href="#">30</a></label>
    <div class="checkbox">
    <label><input type="checkbox" value=""><a href="#">Other</a></label>
    <label for="comment">Comment:</label>
      <textarea class="form-control" rows="5" id="comment"></textarea>
    </div> 
      </ul>
      </div>	   
      <pre>
      <dl>
        <dt class="bg-info"><button type="button" class="btn btn-info">Male</button></dt>
        <dd> 0 - 5</dd>
        <dd> 6 - 12</dd>
        <dd> 13 - 16</dd>
        <dd> 17 plus</dd>
        
        <dt class="bg-danger"><button type="button" class="btn btn-danger">Female</button></dt>
        <dd> 0 - 5</dd>
        <dd> 6 - 12</dd>
        <dd> 13 - 16</dd>
        <dd> 17 plus</dd>
      </dl>    
        </pre>  
        
        <h1>Age Categories</h1>    
  <p>Please tick appropriate age group:</p>
  <dl>
    <dt>Male</dt>
    <dd>- 0 - 5</dd>
	<dd>- 6 - 12</dd>
	<dd>- 13 - 16</dd>
	<dd>- 17 plus</dd>
	
    <dt>Female</dt>
    <dd>- 0 - 5</dd>
	<dd>- 6 - 12</dd>
	<dd>- 13 - 16</dd>
	<dd>- 17 plus</dd>
  </dl>    
	   	
    
    
    
                     
        
    <div class="footer text-center">
    <p>Back to <a href=""""),_display_(/*127.26*/routes/*127.32*/.HomeController.index()),format.raw/*127.55*/("""">Home Page </a></p>
      <ul class="pager">
       <li class="previous"><a href=""""),_display_(/*129.39*/routes/*129.45*/.HomeController.membership()),format.raw/*129.73*/("""">Previous</a></li>
        <li class="next"><a href=""""),_display_(/*130.36*/routes/*130.42*/.HomeController.playtime()),format.raw/*130.68*/("""">Next</a></li>
      </ul>
    </div>
            


""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 16:52:42 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/bookscategory.scala.html
                  HASH: 2678ae940927ed2cd37d94e80d342a494fe4243f
                  MATRIX: 956->1|1067->17|1097->22|1127->44|1166->46|1195->49|1694->521|1709->527|1772->569|2790->1560|2805->1566|2859->1599|2953->1666|2968->1672|3013->1696|6011->4666|6027->4672|6072->4695|6184->4779|6200->4785|6250->4813|6333->4868|6349->4874|6397->4900
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|44->12|44->12|44->12|77->45|77->45|77->45|78->46|78->46|78->46|159->127|159->127|159->127|161->129|161->129|161->129|162->130|162->130|162->130
                  -- GENERATED --
              */
          