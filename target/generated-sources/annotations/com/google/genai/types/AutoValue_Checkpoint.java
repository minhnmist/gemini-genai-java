package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Checkpoint extends Checkpoint {

  private final Optional<String> checkpointId;

  private final Optional<Long> epoch;

  private final Optional<Long> step;

  private AutoValue_Checkpoint(
      Optional<String> checkpointId,
      Optional<Long> epoch,
      Optional<Long> step) {
    this.checkpointId = checkpointId;
    this.epoch = epoch;
    this.step = step;
  }

  @JsonProperty("checkpointId")
  @Override
  public Optional<String> checkpointId() {
    return checkpointId;
  }

  @JsonProperty("epoch")
  @Override
  public Optional<Long> epoch() {
    return epoch;
  }

  @JsonProperty("step")
  @Override
  public Optional<Long> step() {
    return step;
  }

  @Override
  public String toString() {
    return "Checkpoint{"
        + "checkpointId=" + checkpointId + ", "
        + "epoch=" + epoch + ", "
        + "step=" + step
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Checkpoint) {
      Checkpoint that = (Checkpoint) o;
      return this.checkpointId.equals(that.checkpointId())
          && this.epoch.equals(that.epoch())
          && this.step.equals(that.step());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= checkpointId.hashCode();
    h$ *= 1000003;
    h$ ^= epoch.hashCode();
    h$ *= 1000003;
    h$ ^= step.hashCode();
    return h$;
  }

  @Override
  public Checkpoint.Builder toBuilder() {
    return new AutoValue_Checkpoint.Builder(this);
  }

  static final class Builder extends Checkpoint.Builder {
    private Optional<String> checkpointId = Optional.empty();
    private Optional<Long> epoch = Optional.empty();
    private Optional<Long> step = Optional.empty();
    Builder() {
    }
    Builder(Checkpoint source) {
      this.checkpointId = source.checkpointId();
      this.epoch = source.epoch();
      this.step = source.step();
    }
    @Override
    public Checkpoint.Builder checkpointId(String checkpointId) {
      this.checkpointId = Optional.of(checkpointId);
      return this;
    }
    @Override
    Checkpoint.Builder checkpointId(Optional<String> checkpointId) {
      if (checkpointId == null) {
        throw new NullPointerException("Null checkpointId");
      }
      this.checkpointId = checkpointId;
      return this;
    }
    @Override
    public Checkpoint.Builder epoch(Long epoch) {
      this.epoch = Optional.of(epoch);
      return this;
    }
    @Override
    Checkpoint.Builder epoch(Optional<Long> epoch) {
      if (epoch == null) {
        throw new NullPointerException("Null epoch");
      }
      this.epoch = epoch;
      return this;
    }
    @Override
    public Checkpoint.Builder step(Long step) {
      this.step = Optional.of(step);
      return this;
    }
    @Override
    Checkpoint.Builder step(Optional<Long> step) {
      if (step == null) {
        throw new NullPointerException("Null step");
      }
      this.step = step;
      return this;
    }
    @Override
    public Checkpoint build() {
      return new AutoValue_Checkpoint(
          this.checkpointId,
          this.epoch,
          this.step);
    }
  }

}
