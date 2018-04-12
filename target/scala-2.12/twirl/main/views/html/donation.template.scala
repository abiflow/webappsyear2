
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




"""),format.raw/*7.1*/("""<img src=""""),_display_(/*7.12*/routes/*7.18*/.Assets.versioned("images/photo/donatediffe.png")),format.raw/*7.67*/("""" alt " Donate makes a difference"/>

<h2> Donate Books </h2>
<p>
    <img src=""""),_display_(/*11.16*/routes/*11.22*/.Assets.versioned("images/photo/box.png")),format.raw/*11.63*/("""" alt " Books inside box"/>
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
        <img src=""""),_display_(/*33.20*/routes/*33.26*/.Assets.versioned("images/photo/donate.png")),format.raw/*33.70*/("""" alt " Books inside box"/>
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
        <img src=""""),_display_(/*49.20*/routes/*49.26*/.Assets.versioned("images/photo/payment.png")),format.raw/*49.71*/("""" alt " payment method"/>
        <img src=""""),_display_(/*50.20*/routes/*50.26*/.Assets.versioned("images/photo/creditcardicons.png")),format.raw/*50.79*/("""" alt " payment method"/>
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
                  DATE: Thu Apr 12 16:54:33 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/donation.scala.html
                  HASH: d5282c58be3060a051b393b2ce6c46748c78ad01
                  MATRIX: 951->1|1062->17|1090->19|1118->22|1142->38|1181->40|1212->45|1249->56|1263->62|1332->111|1440->192|1455->198|1517->239|2072->767|2087->773|2152->817|2591->1229|2606->1235|2672->1280|2744->1325|2759->1331|2833->1384
                  LINES: 28->1|33->1|34->2|34->2|34->2|34->2|39->7|39->7|39->7|39->7|43->11|43->11|43->11|65->33|65->33|65->33|81->49|81->49|81->49|82->50|82->50|82->50
                  -- GENERATED --
              */
          