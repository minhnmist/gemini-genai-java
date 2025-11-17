package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LiveServerMessage extends LiveServerMessage {

  private final Optional<LiveServerSetupComplete> setupComplete;

  private final Optional<LiveServerContent> serverContent;

  private final Optional<LiveServerToolCall> toolCall;

  private final Optional<LiveServerToolCallCancellation> toolCallCancellation;

  private final Optional<UsageMetadata> usageMetadata;

  private final Optional<LiveServerGoAway> goAway;

  private final Optional<LiveServerSessionResumptionUpdate> sessionResumptionUpdate;

  private AutoValue_LiveServerMessage(
      Optional<LiveServerSetupComplete> setupComplete,
      Optional<LiveServerContent> serverContent,
      Optional<LiveServerToolCall> toolCall,
      Optional<LiveServerToolCallCancellation> toolCallCancellation,
      Optional<UsageMetadata> usageMetadata,
      Optional<LiveServerGoAway> goAway,
      Optional<LiveServerSessionResumptionUpdate> sessionResumptionUpdate) {
    this.setupComplete = setupComplete;
    this.serverContent = serverContent;
    this.toolCall = toolCall;
    this.toolCallCancellation = toolCallCancellation;
    this.usageMetadata = usageMetadata;
    this.goAway = goAway;
    this.sessionResumptionUpdate = sessionResumptionUpdate;
  }

  @JsonProperty("setupComplete")
  @Override
  public Optional<LiveServerSetupComplete> setupComplete() {
    return setupComplete;
  }

  @JsonProperty("serverContent")
  @Override
  public Optional<LiveServerContent> serverContent() {
    return serverContent;
  }

  @JsonProperty("toolCall")
  @Override
  public Optional<LiveServerToolCall> toolCall() {
    return toolCall;
  }

  @JsonProperty("toolCallCancellation")
  @Override
  public Optional<LiveServerToolCallCancellation> toolCallCancellation() {
    return toolCallCancellation;
  }

  @JsonProperty("usageMetadata")
  @Override
  public Optional<UsageMetadata> usageMetadata() {
    return usageMetadata;
  }

  @JsonProperty("goAway")
  @Override
  public Optional<LiveServerGoAway> goAway() {
    return goAway;
  }

  @JsonProperty("sessionResumptionUpdate")
  @Override
  public Optional<LiveServerSessionResumptionUpdate> sessionResumptionUpdate() {
    return sessionResumptionUpdate;
  }

  @Override
  public String toString() {
    return "LiveServerMessage{"
        + "setupComplete=" + setupComplete + ", "
        + "serverContent=" + serverContent + ", "
        + "toolCall=" + toolCall + ", "
        + "toolCallCancellation=" + toolCallCancellation + ", "
        + "usageMetadata=" + usageMetadata + ", "
        + "goAway=" + goAway + ", "
        + "sessionResumptionUpdate=" + sessionResumptionUpdate
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LiveServerMessage) {
      LiveServerMessage that = (LiveServerMessage) o;
      return this.setupComplete.equals(that.setupComplete())
          && this.serverContent.equals(that.serverContent())
          && this.toolCall.equals(that.toolCall())
          && this.toolCallCancellation.equals(that.toolCallCancellation())
          && this.usageMetadata.equals(that.usageMetadata())
          && this.goAway.equals(that.goAway())
          && this.sessionResumptionUpdate.equals(that.sessionResumptionUpdate());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= setupComplete.hashCode();
    h$ *= 1000003;
    h$ ^= serverContent.hashCode();
    h$ *= 1000003;
    h$ ^= toolCall.hashCode();
    h$ *= 1000003;
    h$ ^= toolCallCancellation.hashCode();
    h$ *= 1000003;
    h$ ^= usageMetadata.hashCode();
    h$ *= 1000003;
    h$ ^= goAway.hashCode();
    h$ *= 1000003;
    h$ ^= sessionResumptionUpdate.hashCode();
    return h$;
  }

  @Override
  public LiveServerMessage.Builder toBuilder() {
    return new AutoValue_LiveServerMessage.Builder(this);
  }

  static final class Builder extends LiveServerMessage.Builder {
    private Optional<LiveServerSetupComplete> setupComplete = Optional.empty();
    private Optional<LiveServerContent> serverContent = Optional.empty();
    private Optional<LiveServerToolCall> toolCall = Optional.empty();
    private Optional<LiveServerToolCallCancellation> toolCallCancellation = Optional.empty();
    private Optional<UsageMetadata> usageMetadata = Optional.empty();
    private Optional<LiveServerGoAway> goAway = Optional.empty();
    private Optional<LiveServerSessionResumptionUpdate> sessionResumptionUpdate = Optional.empty();
    Builder() {
    }
    Builder(LiveServerMessage source) {
      this.setupComplete = source.setupComplete();
      this.serverContent = source.serverContent();
      this.toolCall = source.toolCall();
      this.toolCallCancellation = source.toolCallCancellation();
      this.usageMetadata = source.usageMetadata();
      this.goAway = source.goAway();
      this.sessionResumptionUpdate = source.sessionResumptionUpdate();
    }
    @Override
    public LiveServerMessage.Builder setupComplete(LiveServerSetupComplete setupComplete) {
      this.setupComplete = Optional.of(setupComplete);
      return this;
    }
    @Override
    LiveServerMessage.Builder setupComplete(Optional<LiveServerSetupComplete> setupComplete) {
      if (setupComplete == null) {
        throw new NullPointerException("Null setupComplete");
      }
      this.setupComplete = setupComplete;
      return this;
    }
    @Override
    public LiveServerMessage.Builder serverContent(LiveServerContent serverContent) {
      this.serverContent = Optional.of(serverContent);
      return this;
    }
    @Override
    LiveServerMessage.Builder serverContent(Optional<LiveServerContent> serverContent) {
      if (serverContent == null) {
        throw new NullPointerException("Null serverContent");
      }
      this.serverContent = serverContent;
      return this;
    }
    @Override
    public LiveServerMessage.Builder toolCall(LiveServerToolCall toolCall) {
      this.toolCall = Optional.of(toolCall);
      return this;
    }
    @Override
    LiveServerMessage.Builder toolCall(Optional<LiveServerToolCall> toolCall) {
      if (toolCall == null) {
        throw new NullPointerException("Null toolCall");
      }
      this.toolCall = toolCall;
      return this;
    }
    @Override
    public LiveServerMessage.Builder toolCallCancellation(LiveServerToolCallCancellation toolCallCancellation) {
      this.toolCallCancellation = Optional.of(toolCallCancellation);
      return this;
    }
    @Override
    LiveServerMessage.Builder toolCallCancellation(Optional<LiveServerToolCallCancellation> toolCallCancellation) {
      if (toolCallCancellation == null) {
        throw new NullPointerException("Null toolCallCancellation");
      }
      this.toolCallCancellation = toolCallCancellation;
      return this;
    }
    @Override
    public LiveServerMessage.Builder usageMetadata(UsageMetadata usageMetadata) {
      this.usageMetadata = Optional.of(usageMetadata);
      return this;
    }
    @Override
    LiveServerMessage.Builder usageMetadata(Optional<UsageMetadata> usageMetadata) {
      if (usageMetadata == null) {
        throw new NullPointerException("Null usageMetadata");
      }
      this.usageMetadata = usageMetadata;
      return this;
    }
    @Override
    public LiveServerMessage.Builder goAway(LiveServerGoAway goAway) {
      this.goAway = Optional.of(goAway);
      return this;
    }
    @Override
    LiveServerMessage.Builder goAway(Optional<LiveServerGoAway> goAway) {
      if (goAway == null) {
        throw new NullPointerException("Null goAway");
      }
      this.goAway = goAway;
      return this;
    }
    @Override
    public LiveServerMessage.Builder sessionResumptionUpdate(LiveServerSessionResumptionUpdate sessionResumptionUpdate) {
      this.sessionResumptionUpdate = Optional.of(sessionResumptionUpdate);
      return this;
    }
    @Override
    LiveServerMessage.Builder sessionResumptionUpdate(Optional<LiveServerSessionResumptionUpdate> sessionResumptionUpdate) {
      if (sessionResumptionUpdate == null) {
        throw new NullPointerException("Null sessionResumptionUpdate");
      }
      this.sessionResumptionUpdate = sessionResumptionUpdate;
      return this;
    }
    @Override
    public LiveServerMessage build() {
      return new AutoValue_LiveServerMessage(
          this.setupComplete,
          this.serverContent,
          this.toolCall,
          this.toolCallCancellation,
          this.usageMetadata,
          this.goAway,
          this.sessionResumptionUpdate);
    }
  }

}
