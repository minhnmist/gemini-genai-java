package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RealtimeInputConfig extends RealtimeInputConfig {

  private final Optional<AutomaticActivityDetection> automaticActivityDetection;

  private final Optional<ActivityHandling> activityHandling;

  private final Optional<TurnCoverage> turnCoverage;

  private AutoValue_RealtimeInputConfig(
      Optional<AutomaticActivityDetection> automaticActivityDetection,
      Optional<ActivityHandling> activityHandling,
      Optional<TurnCoverage> turnCoverage) {
    this.automaticActivityDetection = automaticActivityDetection;
    this.activityHandling = activityHandling;
    this.turnCoverage = turnCoverage;
  }

  @JsonProperty("automaticActivityDetection")
  @Override
  public Optional<AutomaticActivityDetection> automaticActivityDetection() {
    return automaticActivityDetection;
  }

  @JsonProperty("activityHandling")
  @Override
  public Optional<ActivityHandling> activityHandling() {
    return activityHandling;
  }

  @JsonProperty("turnCoverage")
  @Override
  public Optional<TurnCoverage> turnCoverage() {
    return turnCoverage;
  }

  @Override
  public String toString() {
    return "RealtimeInputConfig{"
        + "automaticActivityDetection=" + automaticActivityDetection + ", "
        + "activityHandling=" + activityHandling + ", "
        + "turnCoverage=" + turnCoverage
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RealtimeInputConfig) {
      RealtimeInputConfig that = (RealtimeInputConfig) o;
      return this.automaticActivityDetection.equals(that.automaticActivityDetection())
          && this.activityHandling.equals(that.activityHandling())
          && this.turnCoverage.equals(that.turnCoverage());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= automaticActivityDetection.hashCode();
    h$ *= 1000003;
    h$ ^= activityHandling.hashCode();
    h$ *= 1000003;
    h$ ^= turnCoverage.hashCode();
    return h$;
  }

  @Override
  public RealtimeInputConfig.Builder toBuilder() {
    return new AutoValue_RealtimeInputConfig.Builder(this);
  }

  static final class Builder extends RealtimeInputConfig.Builder {
    private Optional<AutomaticActivityDetection> automaticActivityDetection = Optional.empty();
    private Optional<ActivityHandling> activityHandling = Optional.empty();
    private Optional<TurnCoverage> turnCoverage = Optional.empty();
    Builder() {
    }
    Builder(RealtimeInputConfig source) {
      this.automaticActivityDetection = source.automaticActivityDetection();
      this.activityHandling = source.activityHandling();
      this.turnCoverage = source.turnCoverage();
    }
    @Override
    public RealtimeInputConfig.Builder automaticActivityDetection(AutomaticActivityDetection automaticActivityDetection) {
      this.automaticActivityDetection = Optional.of(automaticActivityDetection);
      return this;
    }
    @Override
    RealtimeInputConfig.Builder automaticActivityDetection(Optional<AutomaticActivityDetection> automaticActivityDetection) {
      if (automaticActivityDetection == null) {
        throw new NullPointerException("Null automaticActivityDetection");
      }
      this.automaticActivityDetection = automaticActivityDetection;
      return this;
    }
    @Override
    public RealtimeInputConfig.Builder activityHandling(ActivityHandling activityHandling) {
      this.activityHandling = Optional.of(activityHandling);
      return this;
    }
    @Override
    RealtimeInputConfig.Builder activityHandling(Optional<ActivityHandling> activityHandling) {
      if (activityHandling == null) {
        throw new NullPointerException("Null activityHandling");
      }
      this.activityHandling = activityHandling;
      return this;
    }
    @Override
    public RealtimeInputConfig.Builder turnCoverage(TurnCoverage turnCoverage) {
      this.turnCoverage = Optional.of(turnCoverage);
      return this;
    }
    @Override
    RealtimeInputConfig.Builder turnCoverage(Optional<TurnCoverage> turnCoverage) {
      if (turnCoverage == null) {
        throw new NullPointerException("Null turnCoverage");
      }
      this.turnCoverage = turnCoverage;
      return this;
    }
    @Override
    public RealtimeInputConfig build() {
      return new AutoValue_RealtimeInputConfig(
          this.automaticActivityDetection,
          this.activityHandling,
          this.turnCoverage);
    }
  }

}
