
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

object membership extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/(""" 
 """),_display_(/*2.3*/main("membership")/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""
    """),format.raw/*3.5*/("""<!DOCTYPE html>
    <html lang="en">
    <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <link rel="stylesheet" href=""""),_display_(/*11.37*/routes/*11.43*/.Assets.versioned("stylesheets/books.css")),format.raw/*11.85*/("""">
    </head>
<img src=""""),_display_(/*13.12*/routes/*13.18*/.Assets.versioned("images/photo/registr.png")),format.raw/*13.63*/("""" alt="Registration"/>


<form action="action_page.php">
    First name:
    <br>
    <input type="text" name="firstname" value="">
    <br> Last name:
    <br>
    <input type="text" name="lastname" value="">
    <br> Date of Birth:
    <br>
    <input type="text" name="dateofbirth" value="">
    <br> Address:
    <br>
    <input type="text" name="address" value=" ">
    <br> Town:
    <br>
    <input type="text" name="town" value="">
    <br> City:
    <br>
    <input type="text" name="city" value="   ">
    <br> Country:
    <br>
    <input type="text" name="country" value="    ">
    <br>
    <br>
    <input type="radio" name="gender" value="male" checked> Male
    <br>
    <input type="radio" name="gender" value="female"> Female
    <br>
    <input type="radio" name="gender" value="other"> Other
    <br>
    <br>
    <a href="mailto:dsinuola@yahoo.ie?Subject=Hello%20again" target="_top">
        <input type="submit" value="Submit">
    </a>
</form>



<div class="join">
    <h2>It's easy...</h2>
    <p> Fill in the Online Joining form by clicking 'Membership'. </p>
    Our Member may volunteer
    <br> Our Member may donate to us
    <br> Our Members may be An Ambassador
    <br> Our Members may request a book

    <p> Members and visitors can register in just minutes on this website. Download and complete the form.</p>

    <p>You can also email us BFNSA @ citizen.org or post your completed application to:
</div>

<div class="mem_list">
     <p>Books For Nigeria Schools in Africa,</p>
    Nigeria House East Exchange Street,
    <br> Commercial, St. Paul,
    <br> Dublin 2, Ireland.


    <h2>
        <em>What can I request For?</em>
    </h2>
    Books, music, films, PC Games... You decide!
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
                  DATE: Wed Apr 25 19:21:14 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/membership.scala.html
                  HASH: 7caef39f79a82d57d45a75d9dabd2e05d1425f0a
                  MATRIX: 953->1|1064->17|1093->21|1119->39|1158->41|1189->46|1704->534|1719->540|1782->582|1835->608|1850->614|1916->659
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|43->11|43->11|43->11|45->13|45->13|45->13
                  -- GENERATED --
              */
          