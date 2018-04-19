
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
"""),_display_(/*2.2*/main("Donation")/*2.18*/ {_display_(Seq[Any](format.raw/*2.20*/("""
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



<img src=""""),_display_(/*16.12*/routes/*16.18*/.Assets.versioned("images/photo/donatediffe.png")),format.raw/*16.67*/("""" alt " Donate makes a difference"/>

<h2> Donate Books </h2>
<p>
    <img src=""""),_display_(/*20.16*/routes/*20.22*/.Assets.versioned("images/photo/box.png")),format.raw/*20.63*/("""" alt " Books inside box"/>
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
        <img src=""""),_display_(/*42.20*/routes/*42.26*/.Assets.versioned("images/photo/donate.png")),format.raw/*42.70*/("""" alt " Books inside box"/>
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
        <img src=""""),_display_(/*58.20*/routes/*58.26*/.Assets.versioned("images/photo/payment.png")),format.raw/*58.71*/("""" alt " payment method"/>
        <img src=""""),_display_(/*59.20*/routes/*59.26*/.Assets.versioned("images/photo/creditcardicons.png")),format.raw/*59.79*/("""" alt " payment method"/>
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
                  DATE: Thu Apr 19 16:52:09 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/donation.scala.html
                  HASH: 84dba490b3cea0fae2465178b4da8f12068d0648
                  MATRIX: 951->1|1062->17|1090->20|1114->36|1153->38|1184->43|1699->531|1714->537|1777->579|1833->608|1848->614|1918->663|2026->744|2041->750|2103->791|2658->1319|2673->1325|2738->1369|3177->1781|3192->1787|3258->1832|3330->1877|3345->1883|3419->1936
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|43->11|43->11|43->11|48->16|48->16|48->16|52->20|52->20|52->20|74->42|74->42|74->42|90->58|90->58|90->58|91->59|91->59|91->59
                  -- GENERATED --
              */
          