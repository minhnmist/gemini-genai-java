package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_VeoHyperParameters extends VeoHyperParameters {

  private final Optional<Long> epochCount;

  private final Optional<Double> learningRateMultiplier;

  private final Optional<TuningTask> tuningTask;

  private AutoValue_VeoHyperParameters(
      Optional<Long> epochCount,
      Optional<Double> learningRateMultiplier,
      Optional<TuningTask> tuningTask) {
    this.epochCount = epochCount;
    this.learningRateMultiplier = learningRateMultiplier;
    this.tuningTask = tuningTask;
  }

  @JsonProperty("epochCount")
  @Override
  public Optional<Long> epochCount() {
    return epochCount;
  }

  @JsonProperty("learningRateMultiplier")
  @Override
  public Optional<Double> learningRateMultiplier() {
    return learningRateMultiplier;
  }

  @JsonProperty("tuningTask")
  @Override
  public Optional<TuningTask> tuningTask() {
    return tuningTask;
  }

  @Override
  public String toString() {
    return "VeoHyperParameters{"
        + "epochCount=" + epochCount + ", "
        + "learningRateMultiplier=" + learningRateMultiplier + ", "
        + "tuningTask=" + tuningTask
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VeoHyperParameters) {
      VeoHyperParameters that = (VeoHyperParameters) o;
      return this.epochCount.equals(that.epochCount())
          && this.learningRateMultiplier.equals(that.learningRateMultiplier())
          && this.tuningTask.equals(that.tuningTask());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= epochCount.hashCode();
    h$ *= 1000003;
    h$ ^= learningRateMultiplier.hashCode();
    h$ *= 1000003;
    h$ ^= tuningTask.hashCode();
    return h$;
  }

  @Override
  public VeoHyperParameters.Builder toBuilder() {
    return new AutoValue_VeoHyperParameters.Builder(this);
  }

  static final class Builder extends VeoHyperParameters.Builder {
    private Optional<Long> epochCount = Optional.empty();
    private Optional<Double> learningRateMultiplier = Optional.empty();
    private Optional<TuningTask> tuningTask = Optional.empty();
    Builder() {
    }
    Builder(VeoHyperParameters source) {
      this.epochCount = source.epochCount();
      this.learningRateMultiplier = source.learningRateMultiplier();
      this.tuningTask = source.tuningTask();
    }
    @Override
    public VeoHyperParameters.Builder epochCount(Long epochCount) {
      this.epochCount = Optional.of(epochCount);
      return this;
    }
    @Override
    VeoHyperParameters.Builder epochCount(Optional<Long> epochCount) {
      if (epochCount == null) {
        throw new NullPointerException("Null epochCount");
      }
      this.epochCount = epochCount;
      return this;
    }
    @Override
    public VeoHyperParameters.Builder learningRateMultiplier(Double learningRateMultiplier) {
      this.learningRateMultiplier = Optional.of(learningRateMultiplier);
      return this;
    }
    @Override
    VeoHyperParameters.Builder learningRateMultiplier(Optional<Double> learningRateMultiplier) {
      if (learningRateMultiplier == null) {
        throw new NullPointerException("Null learningRateMultiplier");
      }
      this.learningRateMultiplier = learningRateMultiplier;
      return this;
    }
    @Override
    public VeoHyperParameters.Builder tuningTask(TuningTask tuningTask) {
      this.tuningTask = Optional.of(tuningTask);
      return this;
    }
    @Override
    VeoHyperParameters.Builder tuningTask(Optional<TuningTask> tuningTask) {
      if (tuningTask == null) {
        throw new NullPointerException("Null tuningTask");
      }
      this.tuningTask = tuningTask;
      return this;
    }
    @Override
    public VeoHyperParameters build() {
      return new AutoValue_VeoHyperParameters(
          this.epochCount,
          this.learningRateMultiplier,
          this.tuningTask);
    }
  }

}
