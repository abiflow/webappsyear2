
package views.html.mine 

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /* * This template is called from the `index` template. This template * handles the rendering of the page header and body
tags. It takes * two arguments, a `String` for the title of the page and an `Html` * object to insert into the body of the
page. 
*/
  def apply/*5.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.32*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <title>"""),_display_(/*9.11*/title),format.raw/*9.16*/("""</title>
  <meta charset="utf-8">
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href=""""),_display_(/*16.33*/routes/*16.39*/.Assets.versioned("stylesheets/books.css")),format.raw/*16.81*/("""">
</head>
 <body>		   
			   <div class="wrapper">
				<div class="container-fluid">
	
	  <form class="navbar-form navbar-right" action="/action_page.php">
      <div class="form-group">
      <a href="membership.html" button type="button" class="glyphicon glyphicon-user btn btn-success">Sign Up </a></button>
      <a href="bookscategory.html" button type="button" class="btn btn-success">Login </a></button>
	  <p><br>
	  <input type="text" class="form-control" placeholder="Search">
	  
      
      <button type="submit" class="btn btn-default">Go</button>
     </p>
     </form>
    </div>
              
<header>
<h1>Books for Schools In Africa <p class ="small">where books are everything</small></h1></p>

<ul class="pagination">
<h6>Page numbers</h6>    
<li class="active"><a href="index.html">1</a></li>
    <li class="active"><a href="aboutus.html">2</a></li>
    <li class="active"><a href="donation.html">3</a></li>
    <li class="active"><a href="membership.html">4</a></li>
    <li class="active"><a href="bookscategory.html">5</a></li>
	<li class="active"><a href="playtime.html">6</a></li>
	<li class="active"><a href="https://nmaahc.si.edu/">7</a></li>
	<li class="active"><a href="Morenike's Corner.html">8</a></li>
	<li class="active"><a href="contactus.html">9</a></li>
  </ul>		  
					  
  <div class="row">
  <img src="schoolboy.png" class="img-rounded" alt="schoolboy sitting" width="800" height="236">
  <img src= "treebook.png" class="img-rounded" alt=" book tree"width="800" height="236">
  <img src= "outdoor.png" class="img-rounded" alt="children reading without class room"width="800" height="236">
  
    </div>     
   </header>       
 
                          <div class="nav">
                       <nav role="navigation"> 
                   <span class="bold"><a href=""""),_display_(/*61.49*/routes/*61.55*/.HomeController.index()),format.raw/*61.78*/(""""class="btn btn-success" role="button"> Home</a></span>
                  <span class="bold"><a href=""""),_display_(/*62.48*/routes/*62.54*/.HomeController.about()),format.raw/*62.77*/("""" class="btn btn-success" role="button">About Us</a></span>
                 <span class="bold"><a href=""""),_display_(/*63.47*/routes/*63.53*/.HomeController.donation()),format.raw/*63.79*/("""" class="btn btn-success" role="button"> Donation</a></span>
                <span class="bold"><a href=""""),_display_(/*64.46*/routes/*64.52*/.HomeController.membership()),format.raw/*64.80*/("""" class="btn btn-success" role="button">Membership</a></span> 
                   <span class="bold"><a href=""""),_display_(/*65.49*/routes/*65.55*/.HomeController.bookscategory()),format.raw/*65.86*/(""""class="btn btn-success" role="button" > Book Category</a></span>
				   <span class="bold"><a href=""""),_display_(/*66.37*/routes/*66.43*/.HomeController.playtime()),format.raw/*66.69*/(""""class="btn btn-success" role="button" > Play Time</a></span>
                  <span class="bold"><a href="https://nmaahc.si.edu/" target="_blank" class="btn btn-success" role="button">My History, Your Story</a></span>
                    <span class="bold"><a href=""""),_display_(/*68.50*/routes/*68.56*/.HomeController.morenike()),format.raw/*68.82*/("""" class="btn btn-success" role="button">Morenikes' Corner</a></span>
					   <span class="bold"><a href=""""),_display_(/*69.38*/routes/*69.44*/.HomeController.contact()),format.raw/*69.69*/("""" class="btn btn-success" role="button"> Contact Us</a></span>
					   </div>
					   </nav>
                       
            <main>
                """),format.raw/*74.98*/(""" 
                """),_display_(/*75.18*/content),format.raw/*75.25*/("""


            """),format.raw/*78.13*/("""</main>
   <hr>
            <footer>
         
            
                <div class="blank">
                    <a href="donation.html" MAKE A DONATION target="_blank">
                   <img src="donatefunds.png" alt="Donate Funds" class="margin"/></a>
 
                  <a href="membership.html" BECOME A MEMBER target = "_blank">
                 <img src="member.png" alt="Membership" class="margin"/></a>
                 
                 <img id="footer" src="thankyou.png" class="margin"alt="thank you picture"/></p>
                 </div>
                 
            
                 
                    <p class="text-center"> Please <a href="contactus.html" class="alert-link">contact us </a> to make a difference Today!!!</p>
                     
                       
                 
            
                 
            </footer>






<script src=""""),_display_(/*108.15*/routes/*108.21*/.Assets.versioned(" javascripts/main.js ")),format.raw/*108.63*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 25 19:21:14 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/mine /main.scala.html
                  HASH: c72ea27011ba694707051ab165bf6750c9510077
                  MATRIX: 1208->257|1333->287|1360->288|1436->338|1461->343|1916->771|1931->777|1994->819|3835->2633|3850->2639|3894->2662|4024->2765|4039->2771|4083->2794|4216->2900|4231->2906|4278->2932|4411->3038|4426->3044|4475->3072|4613->3183|4628->3189|4680->3220|4809->3322|4824->3328|4871->3354|5167->3623|5182->3629|5229->3655|5362->3761|5377->3767|5423->3792|5603->4025|5649->4044|5677->4051|5720->4066|6635->4953|6651->4959|6715->5001
                  LINES: 31->5|36->5|37->6|40->9|40->9|47->16|47->16|47->16|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|99->68|99->68|99->68|100->69|100->69|100->69|105->74|106->75|106->75|109->78|139->108|139->108|139->108
                  -- GENERATED --
              */
          