// import io.circe._, io.circe.parser._
// import cats.syntax.either._
// import io.circe.Encoder.encodeString
import java.io._
import play.api.libs.json._ 
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._

@main def hello: Unit = 

  case class Conversation(id: Seq[String], displayName:  Seq[String])

  

  val rawJson="/home/priyoi/Files/Alo/Skype-Searchable-Archive/archive/src/main/scala/messages.json"
  val json: JsValue = Json.parse(rawJson)
  

  implicit val convo: Reads[Conversation] = (
   (JsPath \ "conversations" \ "id").read[Seq[String]] and
   (JsPath \ "conversations" \ "displayName").read[Seq[String]]
  
  )(Conversation.apply _)


    println(convo)
  
  // val file = new File("myfile.txt" )
  // val pw = new PrintWriter(file)
  // pw.write(json_content)
  // pw.close()

  // class CC[T] { def unapply(a:Any):Option[T] = Some(a.asInstanceOf[T]) }
  // object L extends CC[List[Any]]



  

  

def msg = "I was compiled by Scala 3. :)"