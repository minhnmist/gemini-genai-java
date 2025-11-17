package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LiveServerSessionResumptionUpdate extends LiveServerSessionResumptionUpdate {

  private final Optional<String> newHandle;

  private final Optional<Boolean> resumable;

  private final Optional<Long> lastConsumedClientMessageIndex;

  private AutoValue_LiveServerSessionResumptionUpdate(
      Optional<String> newHandle,
      Optional<Boolean> resumable,
      Optional<Long> lastConsumedClientMessageIndex) {
    this.newHandle = newHandle;
    this.resumable = resumable;
    this.lastConsumedClientMessageIndex = lastConsumedClientMessageIndex;
  }

  @JsonProperty("newHandle")
  @Override
  public Optional<String> newHandle() {
    return newHandle;
  }

  @JsonProperty("resumable")
  @Override
  public Optional<Boolean> resumable() {
    return resumable;
  }

  @JsonProperty("lastConsumedClientMessageIndex")
  @Override
  public Optional<Long> lastConsumedClientMessageIndex() {
    return lastConsumedClientMessageIndex;
  }

  @Override
  public String toString() {
    return "LiveServerSessionResumptionUpdate{"
        + "newHandle=" + newHandle + ", "
        + "resumable=" + resumable + ", "
        + "lastConsumedClientMessageIndex=" + lastConsumedClientMessageIndex
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LiveServerSessionResumptionUpdate) {
      LiveServerSessionResumptionUpdate that = (LiveServerSessionResumptionUpdate) o;
      return this.newHandle.equals(that.newHandle())
          && this.resumable.equals(that.resumable())
          && this.lastConsumedClientMessageIndex.equals(that.lastConsumedClientMessageIndex());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= newHandle.hashCode();
    h$ *= 1000003;
    h$ ^= resumable.hashCode();
    h$ *= 1000003;
    h$ ^= lastConsumedClientMessageIndex.hashCode();
    return h$;
  }

  @Override
  public LiveServerSessionResumptionUpdate.Builder toBuilder() {
    return new AutoValue_LiveServerSessionResumptionUpdate.Builder(this);
  }

  static final class Builder extends LiveServerSessionResumptionUpdate.Builder {
    private Optional<String> newHandle = Optional.empty();
    private Optional<Boolean> resumable = Optional.empty();
    private Optional<Long> lastConsumedClientMessageIndex = Optional.empty();
    Builder() {
    }
    Builder(LiveServerSessionResumptionUpdate source) {
      this.newHandle = source.newHandle();
      this.resumable = source.resumable();
      this.lastConsumedClientMessageIndex = source.lastConsumedClientMessageIndex();
    }
    @Override
    public LiveServerSessionResumptionUpdate.Builder newHandle(String newHandle) {
      this.newHandle = Optional.of(newHandle);
      return this;
    }
    @Override
    LiveServerSessionResumptionUpdate.Builder newHandle(Optional<String> newHandle) {
      if (newHandle == null) {
        throw new NullPointerException("Null newHandle");
      }
      this.newHandle = newHandle;
      return this;
    }
    @Override
    public LiveServerSessionResumptionUpdate.Builder resumable(boolean resumable) {
      this.resumable = Optional.of(resumable);
      return this;
    }
    @Override
    LiveServerSessionResumptionUpdate.Builder resumable(Optional<Boolean> resumable) {
      if (resumable == null) {
        throw new NullPointerException("Null resumable");
      }
      this.resumable = resumable;
      return this;
    }
    @Override
    public LiveServerSessionResumptionUpdate.Builder lastConsumedClientMessageIndex(Long lastConsumedClientMessageIndex) {
      this.lastConsumedClientMessageIndex = Optional.of(lastConsumedClientMessageIndex);
      return this;
    }
    @Override
    LiveServerSessionResumptionUpdate.Builder lastConsumedClientMessageIndex(Optional<Long> lastConsumedClientMessageIndex) {
      if (lastConsumedClientMessageIndex == null) {
        throw new NullPointerException("Null lastConsumedClientMessageIndex");
      }
      this.lastConsumedClientMessageIndex = lastConsumedClientMessageIndex;
      return this;
    }
    @Override
    public LiveServerSessionResumptionUpdate build() {
      return new AutoValue_LiveServerSessionResumptionUpdate(
          this.newHandle,
          this.resumable,
          this.lastConsumedClientMessageIndex);
    }
  }

}
