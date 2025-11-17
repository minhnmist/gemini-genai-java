package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TunedModelCheckpoint extends TunedModelCheckpoint {

  private final Optional<String> checkpointId;

  private final Optional<Long> epoch;

  private final Optional<Long> step;

  private final Optional<String> endpoint;

  private AutoValue_TunedModelCheckpoint(
      Optional<String> checkpointId,
      Optional<Long> epoch,
      Optional<Long> step,
      Optional<String> endpoint) {
    this.checkpointId = checkpointId;
    this.epoch = epoch;
    this.step = step;
    this.endpoint = endpoint;
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

  @JsonProperty("endpoint")
  @Override
  public Optional<String> endpoint() {
    return endpoint;
  }

  @Override
  public String toString() {
    return "TunedModelCheckpoint{"
        + "checkpointId=" + checkpointId + ", "
        + "epoch=" + epoch + ", "
        + "step=" + step + ", "
        + "endpoint=" + endpoint
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TunedModelCheckpoint) {
      TunedModelCheckpoint that = (TunedModelCheckpoint) o;
      return this.checkpointId.equals(that.checkpointId())
          && this.epoch.equals(that.epoch())
          && this.step.equals(that.step())
          && this.endpoint.equals(that.endpoint());
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
    h$ *= 1000003;
    h$ ^= endpoint.hashCode();
    return h$;
  }

  @Override
  public TunedModelCheckpoint.Builder toBuilder() {
    return new AutoValue_TunedModelCheckpoint.Builder(this);
  }

  static final class Builder extends TunedModelCheckpoint.Builder {
    private Optional<String> checkpointId = Optional.empty();
    private Optional<Long> epoch = Optional.empty();
    private Optional<Long> step = Optional.empty();
    private Optional<String> endpoint = Optional.empty();
    Builder() {
    }
    Builder(TunedModelCheckpoint source) {
      this.checkpointId = source.checkpointId();
      this.epoch = source.epoch();
      this.step = source.step();
      this.endpoint = source.endpoint();
    }
    @Override
    public TunedModelCheckpoint.Builder checkpointId(String checkpointId) {
      this.checkpointId = Optional.of(checkpointId);
      return this;
    }
    @Override
    TunedModelCheckpoint.Builder checkpointId(Optional<String> checkpointId) {
      if (checkpointId == null) {
        throw new NullPointerException("Null checkpointId");
      }
      this.checkpointId = checkpointId;
      return this;
    }
    @Override
    public TunedModelCheckpoint.Builder epoch(Long epoch) {
      this.epoch = Optional.of(epoch);
      return this;
    }
    @Override
    TunedModelCheckpoint.Builder epoch(Optional<Long> epoch) {
      if (epoch == null) {
        throw new NullPointerException("Null epoch");
      }
      this.epoch = epoch;
      return this;
    }
    @Override
    public TunedModelCheckpoint.Builder step(Long step) {
      this.step = Optional.of(step);
      return this;
    }
    @Override
    TunedModelCheckpoint.Builder step(Optional<Long> step) {
      if (step == null) {
        throw new NullPointerException("Null step");
      }
      this.step = step;
      return this;
    }
    @Override
    public TunedModelCheckpoint.Builder endpoint(String endpoint) {
      this.endpoint = Optional.of(endpoint);
      return this;
    }
    @Override
    TunedModelCheckpoint.Builder endpoint(Optional<String> endpoint) {
      if (endpoint == null) {
        throw new NullPointerException("Null endpoint");
      }
      this.endpoint = endpoint;
      return this;
    }
    @Override
    public TunedModelCheckpoint build() {
      return new AutoValue_TunedModelCheckpoint(
          this.checkpointId,
          this.epoch,
          this.step,
          this.endpoint);
    }
  }

}
