
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


    """),format.raw/*5.5*/("""<header>
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
    <p>Back to <a href=""""),_display_(/*47.26*/routes/*47.32*/.HomeController.index()),format.raw/*47.55*/("""">Home Page </a></p>
      <ul "right-side" class="pager">
       <li><a href=""""),_display_(/*49.22*/routes/*49.28*/.HomeController.membership()),format.raw/*49.56*/("""">Previous</a></li>
        <li><a href=""""),_display_(/*50.23*/routes/*50.29*/.HomeController.playtime()),format.raw/*50.55*/("""">Next</a></li>
      </ul>
    </div>
                    
    <ul class="pagination">
    <h6>Page numbers</h6>    
    <li class="active"><a href=""""),_display_(/*56.34*/routes/*56.40*/.HomeController.index()),format.raw/*56.63*/("""">1</a></li>
        <li class="active"><a href=""""),_display_(/*57.38*/routes/*57.44*/.HomeController.about()),format.raw/*57.67*/("""">2</a></li>
        <li class="active"><a href=""""),_display_(/*58.38*/routes/*58.44*/.HomeController.donation()),format.raw/*58.70*/("""">3</a></li>
        <li class="active"><a href=""""),_display_(/*59.38*/routes/*59.44*/.HomeController.membership()),format.raw/*59.72*/("""">4</a></li>
        <li class="active"><a href=""""),_display_(/*60.38*/routes/*60.44*/.HomeController.bookscategory()),format.raw/*60.75*/("""">5</a></li>
        <li class="active"><a href=""""),_display_(/*61.38*/routes/*61.44*/.HomeController.playtime()),format.raw/*61.70*/("""">6</a></li>
        <li class="active"><a href="https://nmaahc.si.edu/">7</a></li>
        <li class="active"><a href=""""),_display_(/*63.38*/routes/*63.44*/.HomeController.morenike()),format.raw/*63.70*/("""">8</a></li>
        <li class="active"><a href=""""),_display_(/*64.38*/routes/*64.44*/.HomeController.contact()),format.raw/*64.69*/("""">9</a></li>
      </ul>		
    

 """)))}),format.raw/*68.3*/("""


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
                  DATE: Thu Apr 12 17:58:26 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/requestforbooks.scala.html
                  HASH: 76e63307d50ed0f5cd430f21654bea5263a2d0e1
                  MATRIX: 958->1|1069->17|1098->21|1131->46|1170->48|1203->55|2832->1657|2847->1663|2891->1686|2998->1766|3013->1772|3062->1800|3131->1842|3146->1848|3193->1874|3371->2025|3386->2031|3430->2054|3507->2104|3522->2110|3566->2133|3643->2183|3658->2189|3705->2215|3782->2265|3797->2271|3846->2299|3923->2349|3938->2355|3990->2386|4067->2436|4082->2442|4129->2468|4277->2589|4292->2595|4339->2621|4416->2671|4431->2677|4477->2702|4542->2737
                  LINES: 28->1|33->1|34->2|34->2|34->2|37->5|79->47|79->47|79->47|81->49|81->49|81->49|82->50|82->50|82->50|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|92->60|93->61|93->61|93->61|95->63|95->63|95->63|96->64|96->64|96->64|100->68
                  -- GENERATED --
              */
          