package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LiveServerGoAway extends LiveServerGoAway {

  private final Optional<Duration> timeLeft;

  private AutoValue_LiveServerGoAway(
      Optional<Duration> timeLeft) {
    this.timeLeft = timeLeft;
  }

  @JsonProperty("timeLeft")
  @Override
  public Optional<Duration> timeLeft() {
    return timeLeft;
  }

  @Override
  public String toString() {
    return "LiveServerGoAway{"
        + "timeLeft=" + timeLeft
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LiveServerGoAway) {
      LiveServerGoAway that = (LiveServerGoAway) o;
      return this.timeLeft.equals(that.timeLeft());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= timeLeft.hashCode();
    return h$;
  }

  @Override
  public LiveServerGoAway.Builder toBuilder() {
    return new AutoValue_LiveServerGoAway.Builder(this);
  }

  static final class Builder extends LiveServerGoAway.Builder {
    private Optional<Duration> timeLeft = Optional.empty();
    Builder() {
    }
    Builder(LiveServerGoAway source) {
      this.timeLeft = source.timeLeft();
    }
    @Override
    public LiveServerGoAway.Builder timeLeft(Duration timeLeft) {
      this.timeLeft = Optional.of(timeLeft);
      return this;
    }
    @Override
    LiveServerGoAway.Builder timeLeft(Optional<Duration> timeLeft) {
      if (timeLeft == null) {
        throw new NullPointerException("Null timeLeft");
      }
      this.timeLeft = timeLeft;
      return this;
    }
    @Override
    public LiveServerGoAway build() {
      return new AutoValue_LiveServerGoAway(
          this.timeLeft);
    }
  }

}
