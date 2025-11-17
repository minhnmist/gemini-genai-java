package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Interval extends Interval {

  private final Optional<Instant> endTime;

  private final Optional<Instant> startTime;

  private AutoValue_Interval(
      Optional<Instant> endTime,
      Optional<Instant> startTime) {
    this.endTime = endTime;
    this.startTime = startTime;
  }

  @JsonProperty("endTime")
  @Override
  public Optional<Instant> endTime() {
    return endTime;
  }

  @JsonProperty("startTime")
  @Override
  public Optional<Instant> startTime() {
    return startTime;
  }

  @Override
  public String toString() {
    return "Interval{"
        + "endTime=" + endTime + ", "
        + "startTime=" + startTime
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Interval) {
      Interval that = (Interval) o;
      return this.endTime.equals(that.endTime())
          && this.startTime.equals(that.startTime());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= endTime.hashCode();
    h$ *= 1000003;
    h$ ^= startTime.hashCode();
    return h$;
  }

  @Override
  public Interval.Builder toBuilder() {
    return new AutoValue_Interval.Builder(this);
  }

  static final class Builder extends Interval.Builder {
    private Optional<Instant> endTime = Optional.empty();
    private Optional<Instant> startTime = Optional.empty();
    Builder() {
    }
    Builder(Interval source) {
      this.endTime = source.endTime();
      this.startTime = source.startTime();
    }
    @Override
    public Interval.Builder endTime(Instant endTime) {
      this.endTime = Optional.of(endTime);
      return this;
    }
    @Override
    Interval.Builder endTime(Optional<Instant> endTime) {
      if (endTime == null) {
        throw new NullPointerException("Null endTime");
      }
      this.endTime = endTime;
      return this;
    }
    @Override
    public Interval.Builder startTime(Instant startTime) {
      this.startTime = Optional.of(startTime);
      return this;
    }
    @Override
    Interval.Builder startTime(Optional<Instant> startTime) {
      if (startTime == null) {
        throw new NullPointerException("Null startTime");
      }
      this.startTime = startTime;
      return this;
    }
    @Override
    public Interval build() {
      return new AutoValue_Interval(
          this.endTime,
          this.startTime);
    }
  }

}
