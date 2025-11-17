package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TuningDataStats extends TuningDataStats {

  private final Optional<DistillationDataStats> distillationDataStats;

  private final Optional<PreferenceOptimizationDataStats> preferenceOptimizationDataStats;

  private final Optional<SupervisedTuningDataStats> supervisedTuningDataStats;

  private AutoValue_TuningDataStats(
      Optional<DistillationDataStats> distillationDataStats,
      Optional<PreferenceOptimizationDataStats> preferenceOptimizationDataStats,
      Optional<SupervisedTuningDataStats> supervisedTuningDataStats) {
    this.distillationDataStats = distillationDataStats;
    this.preferenceOptimizationDataStats = preferenceOptimizationDataStats;
    this.supervisedTuningDataStats = supervisedTuningDataStats;
  }

  @JsonProperty("distillationDataStats")
  @Override
  public Optional<DistillationDataStats> distillationDataStats() {
    return distillationDataStats;
  }

  @JsonProperty("preferenceOptimizationDataStats")
  @Override
  public Optional<PreferenceOptimizationDataStats> preferenceOptimizationDataStats() {
    return preferenceOptimizationDataStats;
  }

  @JsonProperty("supervisedTuningDataStats")
  @Override
  public Optional<SupervisedTuningDataStats> supervisedTuningDataStats() {
    return supervisedTuningDataStats;
  }

  @Override
  public String toString() {
    return "TuningDataStats{"
        + "distillationDataStats=" + distillationDataStats + ", "
        + "preferenceOptimizationDataStats=" + preferenceOptimizationDataStats + ", "
        + "supervisedTuningDataStats=" + supervisedTuningDataStats
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TuningDataStats) {
      TuningDataStats that = (TuningDataStats) o;
      return this.distillationDataStats.equals(that.distillationDataStats())
          && this.preferenceOptimizationDataStats.equals(that.preferenceOptimizationDataStats())
          && this.supervisedTuningDataStats.equals(that.supervisedTuningDataStats());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= distillationDataStats.hashCode();
    h$ *= 1000003;
    h$ ^= preferenceOptimizationDataStats.hashCode();
    h$ *= 1000003;
    h$ ^= supervisedTuningDataStats.hashCode();
    return h$;
  }

  @Override
  public TuningDataStats.Builder toBuilder() {
    return new AutoValue_TuningDataStats.Builder(this);
  }

  static final class Builder extends TuningDataStats.Builder {
    private Optional<DistillationDataStats> distillationDataStats = Optional.empty();
    private Optional<PreferenceOptimizationDataStats> preferenceOptimizationDataStats = Optional.empty();
    private Optional<SupervisedTuningDataStats> supervisedTuningDataStats = Optional.empty();
    Builder() {
    }
    Builder(TuningDataStats source) {
      this.distillationDataStats = source.distillationDataStats();
      this.preferenceOptimizationDataStats = source.preferenceOptimizationDataStats();
      this.supervisedTuningDataStats = source.supervisedTuningDataStats();
    }
    @Override
    public TuningDataStats.Builder distillationDataStats(DistillationDataStats distillationDataStats) {
      this.distillationDataStats = Optional.of(distillationDataStats);
      return this;
    }
    @Override
    TuningDataStats.Builder distillationDataStats(Optional<DistillationDataStats> distillationDataStats) {
      if (distillationDataStats == null) {
        throw new NullPointerException("Null distillationDataStats");
      }
      this.distillationDataStats = distillationDataStats;
      return this;
    }
    @Override
    public TuningDataStats.Builder preferenceOptimizationDataStats(PreferenceOptimizationDataStats preferenceOptimizationDataStats) {
      this.preferenceOptimizationDataStats = Optional.of(preferenceOptimizationDataStats);
      return this;
    }
    @Override
    TuningDataStats.Builder preferenceOptimizationDataStats(Optional<PreferenceOptimizationDataStats> preferenceOptimizationDataStats) {
      if (preferenceOptimizationDataStats == null) {
        throw new NullPointerException("Null preferenceOptimizationDataStats");
      }
      this.preferenceOptimizationDataStats = preferenceOptimizationDataStats;
      return this;
    }
    @Override
    public TuningDataStats.Builder supervisedTuningDataStats(SupervisedTuningDataStats supervisedTuningDataStats) {
      this.supervisedTuningDataStats = Optional.of(supervisedTuningDataStats);
      return this;
    }
    @Override
    TuningDataStats.Builder supervisedTuningDataStats(Optional<SupervisedTuningDataStats> supervisedTuningDataStats) {
      if (supervisedTuningDataStats == null) {
        throw new NullPointerException("Null supervisedTuningDataStats");
      }
      this.supervisedTuningDataStats = supervisedTuningDataStats;
      return this;
    }
    @Override
    public TuningDataStats build() {
      return new AutoValue_TuningDataStats(
          this.distillationDataStats,
          this.preferenceOptimizationDataStats,
          this.supervisedTuningDataStats);
    }
  }

}
