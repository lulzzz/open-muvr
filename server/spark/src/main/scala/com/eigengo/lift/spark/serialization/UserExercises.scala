package com.eigengo.lift.exercise

import com.eigengo.lift.Exercise.Exercise

object UserExercises {

  /**
   * Model version and other metadata
   * @param version the model version
   */
  case class ModelMetadata(version: Int)

  /**
   * The MD companion
   */
  object ModelMetadata {
    /** Special user-classified metadata */
    val user = ModelMetadata(-1231344)
  }

  /**
   * Exercise event received for the given session with model metadata and exercise
   * @param sessionId the session identity
   * @param metadata the model metadata
   * @param exercise the result
   */
  case class ExerciseEvt(sessionId: SessionId, metadata: ModelMetadata, exercise: Exercise)
}
