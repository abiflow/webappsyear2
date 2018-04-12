
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
                      <li><a href=""""),_display_(/*46.37*/routes/*46.43*/.HomeController.requestforbooks()),format.raw/*46.76*/("""">Request For Books</a> </li>
                       <li><a href=""""),_display_(/*47.38*/routes/*47.44*/.HomeController.morenike),format.raw/*47.68*/("""'s Corner()">Morenikes' Corner</a> </li>
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
                       <a href=""""),_display_(/*126.34*/routes/*126.40*/.HomeController.donation()),format.raw/*126.66*/("""" MAKE A DONATION target="_blank">
                      <img src=""""),_display_(/*127.34*/routes/*127.40*/.Assets.versioned("images/photo/donatefunds.png")),format.raw/*127.89*/("""" alt="Donate Funds" class="margin"/></a>
    
                     <a href=""""),_display_(/*129.32*/routes/*129.38*/.HomeController.membership()),format.raw/*129.66*/("""" BECOME A MEMBER target = "_blank">
                    <img src=""""),_display_(/*130.32*/routes/*130.38*/.Assets.versioned("images/photo/member.png")),format.raw/*130.82*/("""" alt="Membership" class="margin"/></a>
                    
                    <img id="footer" src=""""),_display_(/*132.44*/routes/*132.50*/.Assets.versioned("images/photo/thankyou.png")),format.raw/*132.96*/("""" class="margin"alt="thank you picture"/></p>
                    </div>
            
        
    <div class="footer text-center">
    <p>Back to <a href=""""),_display_(/*137.26*/routes/*137.32*/.HomeController.index()),format.raw/*137.55*/("""">Home Page </a></p>
      <ul class="pager">
       <li class="previous"><a href=""""),_display_(/*139.39*/routes/*139.45*/.HomeController.membership()),format.raw/*139.73*/("""">Previous</a></li>
        <li class="next"><a href=""""),_display_(/*140.36*/routes/*140.42*/.HomeController.playtime()),format.raw/*140.68*/("""">Next</a></li>
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
                  DATE: Thu Apr 12 17:23:20 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/bookscategory.scala.html
                  HASH: b782f560d83ab4f9e258fac1c3f65029a2ab8ba7
                  MATRIX: 956->1|1067->17|1097->22|1127->44|1166->46|1270->122|3028->1853|3043->1859|3097->1892|3191->1959|3206->1965|3251->1989|6230->4940|6246->4946|6294->4972|6390->5040|6406->5046|6477->5095|6583->5173|6599->5179|6649->5207|6745->5275|6761->5281|6827->5325|6959->5429|6975->5435|7043->5481|7228->5638|7244->5644|7289->5667|7401->5751|7417->5757|7467->5785|7550->5840|7566->5846|7614->5872
                  LINES: 28->1|33->1|35->3|35->3|35->3|42->10|78->46|78->46|78->46|79->47|79->47|79->47|158->126|158->126|158->126|159->127|159->127|159->127|161->129|161->129|161->129|162->130|162->130|162->130|164->132|164->132|164->132|169->137|169->137|169->137|171->139|171->139|171->139|172->140|172->140|172->140
                  -- GENERATED --
              */
          