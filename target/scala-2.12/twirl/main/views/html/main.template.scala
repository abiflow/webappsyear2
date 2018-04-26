
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
      <a href=""""),_display_(/*24.17*/routes/*24.23*/.HomeController.membership()),format.raw/*24.51*/("""" button type="button" class="glyphicon glyphicon-user btn btn-success">Sign Up </a></button>
      <a href=""""),_display_(/*25.17*/routes/*25.23*/.HomeController.bookscategory()),format.raw/*25.54*/("""" button type="button" class="btn btn-success">Login </a></button>
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
<li class="active"><a href=""""),_display_(/*40.30*/routes/*40.36*/.HomeController.index()),format.raw/*40.59*/("""">1</a></li>
    <li class="active"><a href=""""),_display_(/*41.34*/routes/*41.40*/.HomeController.about()),format.raw/*41.63*/("""">2</a></li>
    <li class="active"><a href=""""),_display_(/*42.34*/routes/*42.40*/.HomeController.donation()),format.raw/*42.66*/("""">3</a></li>
    <li class="active"><a href=""""),_display_(/*43.34*/routes/*43.40*/.HomeController.membership()),format.raw/*43.68*/("""">4</a></li>
    <li class="active"><a href=""""),_display_(/*44.34*/routes/*44.40*/.HomeController.bookscategory()),format.raw/*44.71*/("""">5</a></li>
	<li class="active"><a href=""""),_display_(/*45.31*/routes/*45.37*/.HomeController.playtime()),format.raw/*45.63*/("""">6</a></li>
	<li class="active"><a href="https://nmaahc.si.edu/">7</a></li>
	<li class="active"><a href=""""),_display_(/*47.31*/routes/*47.37*/.HomeController.morenike()),format.raw/*47.63*/("""">8</a></li>
	<li class="active"><a href=""""),_display_(/*48.31*/routes/*48.37*/.HomeController.contact()),format.raw/*48.62*/("""">9</a></li>
  </ul>		  
					  
  <div class="row">
  <img src=""""),_display_(/*52.14*/routes/*52.20*/.Assets.versioned("images/photo/schoolboy.png")),format.raw/*52.67*/("""" class="img-rounded" alt="schoolboy sitting" width="800" height="236">
  <img src= """"),_display_(/*53.15*/routes/*53.21*/.Assets.versioned("images/photo/treebook.png")),format.raw/*53.67*/("""" class="img-rounded" alt=" book tree"width="800" height="236">
  <img src= """"),_display_(/*54.15*/routes/*54.21*/.Assets.versioned("images/photo/outdoor.png")),format.raw/*54.66*/("""" class="img-rounded" alt="children reading without class room"width="800" height="236">
  
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
                       <span class="bold"><a href=""""),_display_(/*69.53*/routes/*69.59*/.HomeController.contact()),format.raw/*69.84*/("""" class="btn btn-success" role="button"> Contact Us</a></span>
                       <span class="bold"><a href=""""),_display_(/*70.53*/routes/*70.59*/.HomeController.requestforbooks()),format.raw/*70.92*/("""" class="btn btn-success" role="button"> Request For Books</a></span>
					   </div>
					   </nav>
                       
            <main>
                """),format.raw/*75.98*/(""" 
                """),_display_(/*76.18*/content),format.raw/*76.25*/("""


            """),format.raw/*79.13*/("""</main>
   <hr>
            <footer>
         
            
                <div class="blank">
                    <a href=""""),_display_(/*85.31*/routes/*85.37*/.HomeController.donation()),format.raw/*85.63*/("""" MAKE A DONATION target="_blank">
                   <img src=""""),_display_(/*86.31*/routes/*86.37*/.Assets.versioned("images/photo/donatefunds.png")),format.raw/*86.86*/("""" alt="Donate Funds" class="margin"/></a>
 
                  <a href=""""),_display_(/*88.29*/routes/*88.35*/.HomeController.membership()),format.raw/*88.63*/("""" BECOME A MEMBER target = "_blank">
                 <img src=""""),_display_(/*89.29*/routes/*89.35*/.Assets.versioned("images/photo/member.png")),format.raw/*89.79*/("""" alt="Membership" class="margin"/></a>
                 
                 <img id="footer" src=""""),_display_(/*91.41*/routes/*91.47*/.Assets.versioned("images/photo/thankyou.png")),format.raw/*91.93*/("""" class="margin"alt="thank you picture"/></p>
                 </div>
                 
            
                 
                    <p class="text-center"> Please <a href=""""),_display_(/*96.62*/routes/*96.68*/.HomeController.contact()),format.raw/*96.93*/("""" class="alert-link">contact us </a> to make a difference Today!!!</p>
                     
                       
                 
            
                 
            </footer>






<script src=""""),_display_(/*109.15*/routes/*109.21*/.Assets.versioned(" javascripts/main.js ")),format.raw/*109.63*/("""" type="text/javascript"></script>
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
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/main.scala.html
                  HASH: 09d24ebfbefe23df9ac814affcb71f206933deae
                  MATRIX: 1202->257|1327->287|1354->288|1430->338|1455->343|1910->771|1925->777|1988->819|2219->1023|2234->1029|2283->1057|2420->1167|2435->1173|2487->1204|2964->1654|2979->1660|3023->1683|3096->1729|3111->1735|3155->1758|3228->1804|3243->1810|3290->1836|3363->1882|3378->1888|3427->1916|3500->1962|3515->1968|3567->1999|3637->2042|3652->2048|3699->2074|3833->2181|3848->2187|3895->2213|3965->2256|3980->2262|4026->2287|4119->2353|4134->2359|4202->2406|4315->2492|4330->2498|4397->2544|4502->2622|4517->2628|4583->2673|4880->2943|4895->2949|4939->2972|5069->3075|5084->3081|5128->3104|5261->3210|5276->3216|5323->3242|5456->3348|5471->3354|5520->3382|5658->3493|5673->3499|5725->3530|5854->3632|5869->3638|5916->3664|6212->3933|6227->3939|6274->3965|6422->4086|6437->4092|6483->4117|6625->4232|6640->4238|6694->4271|6881->4511|6927->4530|6955->4537|6998->4552|7151->4678|7166->4684|7213->4710|7305->4775|7320->4781|7390->4830|7489->4902|7504->4908|7553->4936|7645->5001|7660->5007|7725->5051|7850->5149|7865->5155|7932->5201|8139->5381|8154->5387|8200->5412|8436->5620|8452->5626|8516->5668
                  LINES: 31->5|36->5|37->6|40->9|40->9|47->16|47->16|47->16|55->24|55->24|55->24|56->25|56->25|56->25|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|78->47|78->47|78->47|79->48|79->48|79->48|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|106->75|107->76|107->76|110->79|116->85|116->85|116->85|117->86|117->86|117->86|119->88|119->88|119->88|120->89|120->89|120->89|122->91|122->91|122->91|127->96|127->96|127->96|140->109|140->109|140->109
                  -- GENERATED --
              */
          