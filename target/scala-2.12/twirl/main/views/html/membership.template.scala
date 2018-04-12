
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

"""),format.raw/*4.1*/("""<img src=""""),_display_(/*4.12*/routes/*4.18*/.Assets.versioned("images/photo/registr.png")),format.raw/*4.63*/("""" alt="Registration"/>


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
                  DATE: Thu Apr 12 16:54:33 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/membership.scala.html
                  HASH: a6eecb2f185349ad2b97b830b28bbf7238cf9b99
                  MATRIX: 953->1|1064->17|1093->21|1119->39|1158->41|1186->43|1223->54|1237->60|1302->105
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|36->4|36->4|36->4
                  -- GENERATED --
              */
          