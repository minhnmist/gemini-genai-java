package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LiveServerSetupComplete extends LiveServerSetupComplete {

  private final Optional<String> sessionId;

  private AutoValue_LiveServerSetupComplete(
      Optional<String> sessionId) {
    this.sessionId = sessionId;
  }

  @JsonProperty("sessionId")
  @Override
  public Optional<String> sessionId() {
    return sessionId;
  }

  @Override
  public String toString() {
    return "LiveServerSetupComplete{"
        + "sessionId=" + sessionId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LiveServerSetupComplete) {
      LiveServerSetupComplete that = (LiveServerSetupComplete) o;
      return this.sessionId.equals(that.sessionId());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sessionId.hashCode();
    return h$;
  }

  @Override
  public LiveServerSetupComplete.Builder toBuilder() {
    return new AutoValue_LiveServerSetupComplete.Builder(this);
  }

  static final class Builder extends LiveServerSetupComplete.Builder {
    private Optional<String> sessionId = Optional.empty();
    Builder() {
    }
    Builder(LiveServerSetupComplete source) {
      this.sessionId = source.sessionId();
    }
    @Override
    public LiveServerSetupComplete.Builder sessionId(String sessionId) {
      this.sessionId = Optional.of(sessionId);
      return this;
    }
    @Override
    LiveServerSetupComplete.Builder sessionId(Optional<String> sessionId) {
      if (sessionId == null) {
        throw new NullPointerException("Null sessionId");
      }
      this.sessionId = sessionId;
      return this;
    }
    @Override
    public LiveServerSetupComplete build() {
      return new AutoValue_LiveServerSetupComplete(
          this.sessionId);
    }
  }

}
