
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

    
         
   
    
                             
                    """),format.raw/*10.21*/("""<main>
                
    
                         
                           <div class="text panel-body">
                          <h2>A simple name for an organisation with a simple mission.</h2>
                    
              <p>We collect, sort, ship, and distribute books to students of all ages in Africa. Our goal: to end the book famine in Africa.
    
    Books For Africa remains the largest shipper of donated text and library books to the African continent,
    shipping over 36 million books to 49 different countries since 1988. 
    Over the past 12 months we have shipped 2.4 million books, 154 computers and 62 e-readers containing 467,000 million digital books, as well as 7 new law and human rights libraries to 25 African countries.
     
     More than $2.5 million was raised last year to ship the books to the students of Africa. </p>
                  </div>
                  
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
                      <li><a href="requestforbooks.html">Request For Books</a> </li>
                       <li><a href="morenike's Corner.html">Morenikes' Corner</a> </li>
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
	   	
    
    
    
                     <div class="blank">
                       <a href="donation.html" MAKE A DONATION target="_blank">
                      <img src="donatefunds.png" alt="Donate Funds" class="margin"/></a>
    
                     <a href="membership.html" BECOME A MEMBER target = "_blank">
                    <img src="member.png" alt="Membership" class="margin"/></a>
                    
                    <img id="footer" src="thankyou.png" class="margin"alt="thank you picture"/></p>
                    </div>
            
        
    <div class="footer text-center">
    <p>Back to <a href="index.html">Home Page </a></p>
      <ul class="pager">
       <li class="previous"><a href="membership.html">Previous</a></li>
        <li class="next"><a href="playtime.html">Next</a></li>
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
                  DATE: Wed Apr 11 20:42:13 IST 2018
                  SOURCE: /home/wdd/webapps/year2WebApp/app/views/bookscategory.scala.html
                  HASH: 9a37b282cd12da37d43ac973e9978eb79ff99817
                  MATRIX: 956->1|1067->17|1097->22|1127->44|1166->46|1270->122
                  LINES: 28->1|33->1|35->3|35->3|35->3|42->10
                  -- GENERATED --
              */
          