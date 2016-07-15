package org.template.ecommerce

import io.prediction.controller.Evaluation
import io.prediction.controller.MetricEvaluator

object CompleteEvaluation extends Evaluation {
  engineEvaluator = (
    EcommerceEngine(),
    MetricEvaluator(
      metric = Accuracy(),
      otherMetrics = Seq(Precision(0.0), Precision(1.0), Precision(2.0)),
      outputPath = "best.json"))
}
