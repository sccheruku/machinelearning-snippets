// Find most popular elements
object DecayingWindows extends App{
  val elements = List("62","80","24","25","59","35","9","20","55","3","32","18","97","97","67","99","90","56","17","37","69","47","26","59","64","46","39","43","74","29","40","66","89","22","42","45","60","75","58","4","43","35","26","87","81","72","33","51","84","45","37","20","79","48","60","32","42","70","46","3","48","19","93","99","99","50","31","26","40","10","72","12","3","2","70","27","58","49","24","96","13","1","80","28","89","24","78","82","77","79","98","15","30","84","33","33","23","22","41","7","58","100","51","68","15","49","84","1","69","96","32","46","29","58","71","69","58","24","97","87","74","58","30","35","41","43","25","24","57","7","98","34","27","94","58","62","62","85","47","9","79","73","81","27","6","40","78","68","94","80","36","15","17","47","10","45","65","45","16","23","43","31","87","93","3","79","47","41","5","59","67","84","77","14","46","28","95","39","68","49","88","67","31","67","67","38","33","90","54","98","65","45","69","63","68","99","21","10","1","77","100","76","51","84","97","9","13","29","43","80","28","9","37","25","45","63","92","59","60","71","58","4","31","64","82","69","94","4","74","92","1","51","10","27","100","58","92","80","100","91","80","33","28","100","98","39","83","39","17","33","89","88","92","50","83","99","28","62","64","7","32","80","90","86","89","90","33","90","63","59","98","63","21","34","67","13","67","82","55","95","27","13","85","64","81","78","64","21","43","38","90","78","76","37","57","25","43","4","15","98","61","33","4","88","58","36","36","18","49","26","63","93","54","30","1","93","27","10","29","96","88","99","88","74","5","2","85","32","51","77","69","72","94","13","5","99","47","52","15","76","10","14","44","21","14","36","53","91","77","57","1","66","81","61","29","74","23","40","61","64","28","96","24","54","30","50","77","5","27","60","79","10","11","72","51","79","30","80","60","89","19","41","66","4","27","96","32","93","55","73","85","71","96","32","20","4","76","75","88","56","10","48","73","87","46","17","29","58","86","21","20","61","15","52","40","88","23","52","15","24","7","39","1","96","45","89","66","24","70","44","41","60","68","21","50","100","95","24","14","59","42","63","68","1","61","38","29","5","35","47","36","58","7","34","98","89","41","13","98","20","29","75","16","36","15","56","34","52","6","71","56","97","90","1","83","49","3","59","20","75","92","58","79","34","82","8","61","57","39","88","8","19","50","66","24","34","96","76","24","49","27","90","38","48","28","34","50","99","3","45","99","39","23","56","72","78","2","79","58","4","34","53","7","79","98","5","10","81","43","79","87","99","5","98","61","62","74","97","98","36","99","96","33","35","27","66","15","89","5","86","89","47","64","89","96","85","81","96","79","5","79","20","37","6","34","59","99","46","55","44","95","18","75","56","89","11","26","57","38","15","74","45","80","30","72","81","61","50","18","46","39","77","85","53","38","87","2","1","93","90","72","13","7","73","27","58","48","53","1","52","87","23","100","53","73","54","36","68","98","100","76","38","82","92","82","43","10","20","80","42","24","41","63","4","34","13","37","98","63","50","62","74","33","82","17","61","59","39","12","70","24","20","38","21","68","53","90","89","28","34","7","48","97","29","4","39","36","90","85","88","25","28","16","56","63","14","41","58","56","97","35","64","59","42","48","7","9","9","47","24","2","96","33","84","12","21","45","15","13","61","58","89","19","17","83","48","57","48","76","86","64","74","69","82","59","84","6","71","75","51","7","10","86","96","58","17","65","31","99","26","71","65","31","7","46","45","28","46","9","10","31","27","93","64","7","58","47","15","83","61","75","52","60","68","37","44","16","61","93","72","2","55","45","45","71","9","30","55","10","78","9","15","99","62","79","38","22","35","16","40","22","2","17","38","98","33","86","27","24","64","22","83","23","20","97","56","33","94","11","10","69","59","20","52","41","80","47","24","6","23","10","34","71","34","26","36","8","23","63","73","13","86","5","54","21","49","67","82","17","43","78","39","73","22","26","78","12","61","64","81","51","19","76","65","53","76","79","71","96","97","95","57","31","42","57","86","98","2","43","49","55","65","16","4","76","16","85","49","66","43","83","100","6","74","6","48","34","17","6","51","3","84","45","29","51","30","65","94","74","8","61","2","45","1","85","32","31","96","22","24","15","22","30","61","85","38","13","93","28","7","40","24","78","44","33","14","46","70","89","60","44","75","73","36","90","35","81","63","95","1","24","24","54","94","39","25","76","58","93","32","98","38","14","28","33","35","45","40","14","72","14","26","38","29","22","16","38","17","29","37","12","65","88","77","17","98","87","100","76","100","75","48","89","95","74","7","95","68","66","38","44","64","51","91","17","92","7","62","56","4","64","26","65","91","63","99","66","15","13","41").map(e => e.toInt)
  val windowSize = 100
  val tenMostPopularElementsInEntireStream = elements
      // Map -> Group -> Reduce
      .map(e => (e,1))
      .groupBy(e => e._1)
      .map(k => (k._1,k._2.size))
      .toSeq.sortWith(_._2 > _._2)
      .take(10)
  println(s"tenMostPopularElementsInEntireStream: $tenMostPopularElementsInEntireStream")
  val tenMostPopularElementsInWindow = elements
      .drop(windowSize)
      .map(e => (e,1))
      .groupBy(e => e._1)
      .map(k => (k._1,k._2.size))
      .toSeq.sortWith(_._2 > _._2)
      .take(10)
  println(s"tenMostPopularElementsInWindow: $tenMostPopularElementsInWindow")
  val c = Math.pow(10, -3)
  val tenMostPopularElementsInADecayingWindow = elements
      .zipWithIndex
      .map(e => (e._1, Math.pow(1 - c, e._2.toDouble)))
      .groupBy(e => e._1)
      .map(k => (k._1,k._2.map(e => e._2).sum))
      .toSeq.sortWith(_._2 > _._2)
      .take(10)
  println(s"tenMostPopularElementsInADecayingWindow: $tenMostPopularElementsInADecayingWindow")
}

/* output:

tenMostPopularElementsInEntireStream:
  Vector((24,20), (58,20), (98,17), (45,16), (10,15), (61,15), (89,15), (38,15), (33,15), (96,15))
tenMostPopularElementsInWindow:
  Vector((58,18), (24,17), (98,16), (61,15), (38,15), (10,14), (96,14), (34,14), (45,14), (7,14))
tenMostPopularElementsInADecayingWindow:
  Vector((58,14.085984939318124), (24,12.534985373884345), (98,10.657409083606371), (45,10.198356275014723),
        (99,10.15480918423529), (33,9.980725516167443), (10,9.65134147916649), (89,9.491717857826895),
        (15,9.42670437446881), (96,9.41491789254816))

 */