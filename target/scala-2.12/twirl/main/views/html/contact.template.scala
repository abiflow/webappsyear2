
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


<img src="spaces.png" alt" ofiice picture"/>

       

<a href=" http://www.travelstart.com.ng/blog/30-top-attractions-in-nigeria" Flag target= "_blank">
<img src="9jalogo.png" alt=""/>Tourism In Nigeria****</a>


<a href=" http://www.nigeriahc.org.uk/culture-tourism"> History Of Nigeria</a>
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
                  SOURCE: /home/wdd/webapps/year2WebApp/app/views/contact.scala.html
                  HASH: bb163166aff4ba00bb5fee3f2b66caae63f8505c
                  MATRIX: 950->1|1061->17|1090->21|1116->39|1155->41|1188->48
                  LINES: 28->1|33->1|35->3|35->3|35->3|38->6
                  -- GENERATED --
              */
          