package org.template.ecommerce

import io.prediction.controller.IEngineFactory
import io.prediction.controller.Engine

class Query(
  val features: Array[Double]
) extends Serializable

class PredictedResult(
  val label: Double
) extends Serializable

class ActualResult(
  val label: Double
) extends Serializable

object EcommerceEngine extends IEngineFactory {
  def apply() = {
    new Engine(
      classOf[DataSource],
      classOf[Preparator],
      Map("logisticSGD" -> classOf[LogisticRegressionWithSGDAlgorithm]),
      classOf[Serving])
  }
}
