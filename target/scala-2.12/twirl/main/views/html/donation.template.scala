
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

object donation extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/(""" 
"""),format.raw/*2.1*/(""") """),_display_(/*2.4*/main("Donation")/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""




"""),format.raw/*7.1*/("""<img src="donatediffe.png" alt " Donate makes a difference"/>

<h2> Donate Books </h2>
<p>
    <img src="box.png" alt " Books inside box"/>
</p>
<h3>Books For Nigeria Schools In Africa needs all book donations. </h3>
<br> Two for One- Donate £1 / $1 for every two books donated to us.</br>

<p>If mailing books, please send book donations to or drop off books at:</p>



<ul>
    <li>Books For Nigeria Schools in Africa Warehouse-Balsbridge</li>
    <li>3655 Balsbridge Industrial Drive,</li>
    <li>Stillorgan</li>
    <li>South Dublin, Ireland</li>
</ul>


<div class="main_menu">

    <h2> Donate Fund </h2>

    <p>
        <img src="donate.png" alt " Books inside box"/>
    </p>

    <p>You can also mail a check, cash or money order to:</p>

    <ul>
        <li>Books For Nigeria Schools in Africa,</li>
        <li>Nigeria House East Exchange Street,</li>
        <li>Commercial, St. Paul, </li>
        <li>Dublin 2, Ireland.</li>
    </ul>
</div>

<div class="payment">
    <p>Or make a donation online. </p>
    <li class="img">
        <img src="payment.png" alt " payment method"/>
        <img src="creditcardicons.png" alt " payment method"/>
    </li>
</div>
<div class="don_text">
    <p>When you donate, you will receive an automatic thank you letter. Please check your junk folder and if you did not receive
        one, email bfnsa@booksforNigeria Schoolsafrica.org.</p>
    <p>Your donation will defray high shipping costs and enable Books For Nigeria Schools in Africa to ship even more books
        to children in Nigeria who are eager to read and learn.
        <p> Consider making a financial donation to cover the costs of shipping the books you donate.
            <br> Please send financial donations separately in an envelope to the BFNS office: </p>
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
                  SOURCE: /home/wdd/webapps/year2WebApp/app/views/donation.scala.html
                  HASH: 20258020d7525354fec6d8f439b927d9e4b88758
                  MATRIX: 951->1|1062->17|1090->19|1118->22|1142->38|1181->40|1212->45
                  LINES: 28->1|33->1|34->2|34->2|34->2|34->2|39->7
                  -- GENERATED --
              */
          