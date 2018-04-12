
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


    """),format.raw/*6.5*/("""<p>Now, 20,000 students in 30 schools in 30 communities have access to books that will broaden individual horizons, 
        enhance classrooms, and maybe significantly change a life or two.</p>
          <h2>Where We Work</h2>
              Books for Nigeria Schools in Africa is a charity organizations work throughout Nigeria—
              that area of the continent located at the Western part of Africa.


<img src=""""),_display_(/*13.12*/routes/*13.18*/.Assets.versioned("images/photo/spaces.png")),format.raw/*13.62*/("""" alt" office picture"/>

       

<a href=""""),_display_(/*17.11*/routes/*17.17*/.Assets.versioned("images/photo/ http://www.travelstart.com.ng/blog/30-top-attractions-in-nigeria")),format.raw/*17.116*/("""" Flag target= "_blank">
<img src=""""),_display_(/*18.12*/routes/*18.18*/.Assets.versioned("images/photo/9jalogo.png")),format.raw/*18.63*/("""" alt=""/>Tourism In Nigeria****</a>


<a href=" """),_display_(/*21.12*/routes/*21.18*/.Assets.versioned("images/photo/http://www.nigeriahc.org.uk/culture-tourism")),format.raw/*21.95*/("""" History Of Nigeria</a>
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
    <p>Back to <a href=""""),_display_(/*42.26*/routes/*42.32*/.HomeController.index()),format.raw/*42.55*/("""">Home Page </a></p>
      <ul "right-side" class="pager">
       <li><a href=""""),_display_(/*44.22*/routes/*44.28*/.HomeController.membership()),format.raw/*44.56*/("""">Previous</a></li>
        <li><a href=""""),_display_(/*45.23*/routes/*45.29*/.HomeController.playtime()),format.raw/*45.55*/("""">Next</a></li>
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
                  DATE: Thu Apr 12 21:27:57 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/contact.scala.html
                  HASH: b64894b7bbf932f7a88742ef731eef530c28b88d
                  MATRIX: 950->1|1061->17|1090->21|1116->39|1155->41|1188->48|1638->471|1653->477|1718->521|1790->566|1805->572|1926->671|1989->707|2004->713|2070->758|2147->808|2162->814|2260->891|2859->1463|2874->1469|2918->1492|3025->1572|3040->1578|3089->1606|3158->1648|3173->1654|3220->1680
                  LINES: 28->1|33->1|35->3|35->3|35->3|38->6|45->13|45->13|45->13|49->17|49->17|49->17|50->18|50->18|50->18|53->21|53->21|53->21|74->42|74->42|74->42|76->44|76->44|76->44|77->45|77->45|77->45
                  -- GENERATED --
              */
          