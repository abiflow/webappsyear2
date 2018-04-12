
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/(""" 
 
"""),_display_(/*3.2*/main("About Us")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

"""),format.raw/*5.1*/("""<img src=""""),_display_(/*5.12*/routes/*5.18*/.Assets.versioned("images/photo/classroom.png")),format.raw/*5.65*/("""" alt="" />
<img src=""""),_display_(/*6.12*/routes/*6.18*/.Assets.versioned("images/photo/kidsbooks.png")),format.raw/*6.65*/("""" alt="" />


<img src=""""),_display_(/*9.12*/routes/*9.18*/.Assets.versioned("images/photo/stream.png")),format.raw/*9.62*/("""" alt="" />


<h2>What You Need to know About Us</h2>

<p>Our mission is to end the book famine in Africa. The ultimate aim of this project is to equip children with numeracy, literacy
    and wilder skills that they need to realise their dream. With generous heart and your help, we will help create a culture
    of literacy and provide the tools of empowerment to the next generation of parents, teachers, and leaders in Nigeria.
    Books donated by publishers, schools, libraries, individuals, and organizations are sorted and packed by volunteers who
    carefully choose books that are age and subject appropriate. We send good books, enough books for a whole school to use
    and our volunteers assist in setting up libraries. The cost of sending a book from England and Ireland is £1 for two
    books. They are cargo by flight and shipped in sea containers through your contributions.

    <p>You are our hope! Books For Nigeria Schools in Africa has shipped more than 1 million books to different states and villages.
        We aim to be able to ship computers and e-readers containing 467,000 million digital books, and continue to build
        library in schools. We need your fund to raise 2.5 million to ship the books to the students in Nigeria Africa. They
        are on once-empty library shelves, in classrooms in rural schools, and in the hands of children who have never before
        held a book. Each book will be read over and over again. When the books arrive, they go to those who need them most:
        children who are hungry to read, hungry to learn, hungry to explore the world in ways that only books make possible.
        </p>
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
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/about.scala.html
                  HASH: 8d275ffcce2995b73e7ee7aced34f6d519b1e8f2
                  MATRIX: 948->1|1059->17|1089->22|1113->38|1152->40|1180->42|1217->53|1231->59|1298->106|1347->129|1361->135|1428->182|1479->207|1493->213|1557->257
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|37->5|37->5|37->5|38->6|38->6|38->6|41->9|41->9|41->9
                  -- GENERATED --
              */
          