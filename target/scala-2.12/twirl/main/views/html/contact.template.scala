
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/(""" 

"""),_display_(/*3.2*/main("Contact us")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
  """),format.raw/*4.3*/("""<!DOCTYPE html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href=""""),_display_(/*12.35*/routes/*12.41*/.Assets.versioned("stylesheets/books.css")),format.raw/*12.83*/("""">
  </head>

    <p>Now, 20,000 students in 30 schools in 30 communities have access to books that will broaden individual horizons, 
        enhance classrooms, and maybe significantly change a life or two.</p>
          <h2>Where We Work</h2>
              Books for Nigeria Schools in Africa is a charity organizations work throughout Nigeria—
              that area of the continent located at the Western part of Africa.


<img src=""""),_display_(/*22.12*/routes/*22.18*/.Assets.versioned("images/photo/spaces.png")),format.raw/*22.62*/("""" alt" office picture"/>

       

<a href=""""),_display_(/*26.11*/routes/*26.17*/.Assets.versioned("images/photo/ http://www.travelstart.com.ng/blog/30-top-attractions-in-nigeria")),format.raw/*26.116*/("""" Flag target= "_blank">
<img src=""""),_display_(/*27.12*/routes/*27.18*/.Assets.versioned("images/photo/9jalogo.png")),format.raw/*27.63*/("""" alt=""/>Tourism In Nigeria****</a>


<a href=" """),_display_(/*30.12*/routes/*30.18*/.Assets.versioned("images/photo/http://www.nigeriahc.org.uk/culture-tourism")),format.raw/*30.95*/("""" History Of Nigeria</a>
     <h2>If mailing books, please send book donations to or drop off books at:</h2>
<ul>
<li>Books For Nigeria Schools in Africa Warehouse-Balsbridge
 <li>3655 Balsbridge Industrial Drive
  <li>Stillorgan
   <li>South Dublin, Ireland</p>
         </ul>



<h2>You can also mail a check, cash or money order to:</h2>
 <ul>
  <li>Books For Nigeria Schools in Africa,</li> 
<li>Nigeria House East Exchange Street,</li> 
<li>Commercial, St. Paul, </li>
<li>Dublin 2, Ireland.</li>
</ul>

    
<div class="footer text-center">
    <p>Back to <a href=""""),_display_(/*51.26*/routes/*51.32*/.HomeController.index()),format.raw/*51.55*/("""">Home Page </a></p>
      <ul "right-side" class="pager">
       <li><a href=""""),_display_(/*53.22*/routes/*53.28*/.HomeController.membership()),format.raw/*53.56*/("""">Previous</a></li>
        <li><a href=""""),_display_(/*54.23*/routes/*54.29*/.HomeController.playtime()),format.raw/*54.55*/("""">Next</a></li>
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
                  DATE: Wed Apr 25 19:21:14 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/contact.scala.html
                  HASH: 462c900460b794b702e1d26e00b701eae3b0ad3a
                  MATRIX: 950->1|1061->17|1090->21|1116->39|1155->41|1184->44|1683->516|1698->522|1761->564|2229->1005|2244->1011|2309->1055|2381->1100|2396->1106|2517->1205|2580->1241|2595->1247|2661->1292|2738->1342|2753->1348|2851->1425|3450->1997|3465->2003|3509->2026|3616->2106|3631->2112|3680->2140|3749->2182|3764->2188|3811->2214
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|44->12|44->12|44->12|54->22|54->22|54->22|58->26|58->26|58->26|59->27|59->27|59->27|62->30|62->30|62->30|83->51|83->51|83->51|85->53|85->53|85->53|86->54|86->54|86->54
                  -- GENERATED --
              */
          