
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

object requestforbooks extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/(""" 
 """),_display_(/*2.3*/main("Request For Books")/*2.28*/ {_display_(Seq[Any](format.raw/*2.30*/("""
  """),format.raw/*3.3*/("""<!DOCTYPE html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href=""""),_display_(/*11.35*/routes/*11.41*/.Assets.versioned("stylesheets/books.css")),format.raw/*11.83*/("""">
  </head>

    <header>
            <h1>How to Request for Books</h1> 
            

        
              </header>

              <p>Members can request for book from any location in Nigeria.</p>
              <ul>
                <li>Members can donate books.<li>
                  <li>Members can volunteer<li>
                      </ul>
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
    <br>
    <h1>Information About Shipments</h1>
    
    Books For Nigeria Schools In Africa receives new and used book donations from organisations, places of worship, charities across Europe, US and other continents.<br>
    We accepted books from public and private schools, libraries, publishers, and individuals. <br>
    We accept books at all age levels, from preschool (beginning reader) to post-secondary (college or university). <br>
    Donated books are sorted and processed for shipping by volunteers.<br>
    
                 
               
            <div class="footer text-center">
    <p>Back to <a href=""""),_display_(/*56.26*/routes/*56.32*/.HomeController.index()),format.raw/*56.55*/("""">Home Page </a></p>
      <ul "right-side" class="pager">
       <li><a href=""""),_display_(/*58.22*/routes/*58.28*/.HomeController.membership()),format.raw/*58.56*/("""">Previous</a></li>
        <li><a href=""""),_display_(/*59.23*/routes/*59.29*/.HomeController.playtime()),format.raw/*59.55*/("""">Next</a></li>
      </ul>
    </div>
                    
    <ul class="pagination">
    <h6>Page numbers</h6>    
    <li class="active"><a href=""""),_display_(/*65.34*/routes/*65.40*/.HomeController.index()),format.raw/*65.63*/("""">1</a></li>
        <li class="active"><a href=""""),_display_(/*66.38*/routes/*66.44*/.HomeController.about()),format.raw/*66.67*/("""">2</a></li>
        <li class="active"><a href=""""),_display_(/*67.38*/routes/*67.44*/.HomeController.donation()),format.raw/*67.70*/("""">3</a></li>
        <li class="active"><a href=""""),_display_(/*68.38*/routes/*68.44*/.HomeController.membership()),format.raw/*68.72*/("""">4</a></li>
        <li class="active"><a href=""""),_display_(/*69.38*/routes/*69.44*/.HomeController.bookscategory()),format.raw/*69.75*/("""">5</a></li>
        <li class="active"><a href=""""),_display_(/*70.38*/routes/*70.44*/.HomeController.playtime()),format.raw/*70.70*/("""">6</a></li>
        <li class="active"><a href="https://nmaahc.si.edu/">7</a></li>
        <li class="active"><a href=""""),_display_(/*72.38*/routes/*72.44*/.HomeController.morenike()),format.raw/*72.70*/("""">8</a></li>
        <li class="active"><a href=""""),_display_(/*73.38*/routes/*73.44*/.HomeController.contact()),format.raw/*73.69*/("""">9</a></li>
      </ul>		
    

 """)))}),format.raw/*77.3*/("""


 """))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 25 19:21:14 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/requestforbooks.scala.html
                  HASH: 4f81511cd9cf78f375f6e6dee564e4274f73ff87
                  MATRIX: 958->1|1069->17|1098->21|1131->46|1170->48|1199->51|1698->523|1713->529|1776->571|3423->2191|3438->2197|3482->2220|3589->2300|3604->2306|3653->2334|3722->2376|3737->2382|3784->2408|3962->2559|3977->2565|4021->2588|4098->2638|4113->2644|4157->2667|4234->2717|4249->2723|4296->2749|4373->2799|4388->2805|4437->2833|4514->2883|4529->2889|4581->2920|4658->2970|4673->2976|4720->3002|4868->3123|4883->3129|4930->3155|5007->3205|5022->3211|5068->3236|5133->3271
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|43->11|43->11|43->11|88->56|88->56|88->56|90->58|90->58|90->58|91->59|91->59|91->59|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|100->68|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|104->72|104->72|104->72|105->73|105->73|105->73|109->77
                  -- GENERATED --
              */
          