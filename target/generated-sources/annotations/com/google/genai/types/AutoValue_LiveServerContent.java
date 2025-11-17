package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LiveServerContent extends LiveServerContent {

  private final Optional<Content> modelTurn;

  private final Optional<Boolean> turnComplete;

  private final Optional<Boolean> interrupted;

  private final Optional<GroundingMetadata> groundingMetadata;

  private final Optional<Boolean> generationComplete;

  private final Optional<Transcription> inputTranscription;

  private final Optional<Transcription> outputTranscription;

  private final Optional<UrlContextMetadata> urlContextMetadata;

  private final Optional<TurnCompleteReason> turnCompleteReason;

  private final Optional<Boolean> waitingForInput;

  private AutoValue_LiveServerContent(
      Optional<Content> modelTurn,
      Optional<Boolean> turnComplete,
      Optional<Boolean> interrupted,
      Optional<GroundingMetadata> groundingMetadata,
      Optional<Boolean> generationComplete,
      Optional<Transcription> inputTranscription,
      Optional<Transcription> outputTranscription,
      Optional<UrlContextMetadata> urlContextMetadata,
      Optional<TurnCompleteReason> turnCompleteReason,
      Optional<Boolean> waitingForInput) {
    this.modelTurn = modelTurn;
    this.turnComplete = turnComplete;
    this.interrupted = interrupted;
    this.groundingMetadata = groundingMetadata;
    this.generationComplete = generationComplete;
    this.inputTranscription = inputTranscription;
    this.outputTranscription = outputTranscription;
    this.urlContextMetadata = urlContextMetadata;
    this.turnCompleteReason = turnCompleteReason;
    this.waitingForInput = waitingForInput;
  }

  @JsonProperty("modelTurn")
  @Override
  public Optional<Content> modelTurn() {
    return modelTurn;
  }

  @JsonProperty("turnComplete")
  @Override
  public Optional<Boolean> turnComplete() {
    return turnComplete;
  }

  @JsonProperty("interrupted")
  @Override
  public Optional<Boolean> interrupted() {
    return interrupted;
  }

  @JsonProperty("groundingMetadata")
  @Override
  public Optional<GroundingMetadata> groundingMetadata() {
    return groundingMetadata;
  }

  @JsonProperty("generationComplete")
  @Override
  public Optional<Boolean> generationComplete() {
    return generationComplete;
  }

  @JsonProperty("inputTranscription")
  @Override
  public Optional<Transcription> inputTranscription() {
    return inputTranscription;
  }

  @JsonProperty("outputTranscription")
  @Override
  public Optional<Transcription> outputTranscription() {
    return outputTranscription;
  }

  @JsonProperty("urlContextMetadata")
  @Override
  public Optional<UrlContextMetadata> urlContextMetadata() {
    return urlContextMetadata;
  }

  @JsonProperty("turnCompleteReason")
  @Override
  public Optional<TurnCompleteReason> turnCompleteReason() {
    return turnCompleteReason;
  }

  @JsonProperty("waitingForInput")
  @Override
  public Optional<Boolean> waitingForInput() {
    return waitingForInput;
  }

  @Override
  public String toString() {
    return "LiveServerContent{"
        + "modelTurn=" + modelTurn + ", "
        + "turnComplete=" + turnComplete + ", "
        + "interrupted=" + interrupted + ", "
        + "groundingMetadata=" + groundingMetadata + ", "
        + "generationComplete=" + generationComplete + ", "
        + "inputTranscription=" + inputTranscription + ", "
        + "outputTranscription=" + outputTranscription + ", "
        + "urlContextMetadata=" + urlContextMetadata + ", "
        + "turnCompleteReason=" + turnCompleteReason + ", "
        + "waitingForInput=" + waitingForInput
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LiveServerContent) {
      LiveServerContent that = (LiveServerContent) o;
      return this.modelTurn.equals(that.modelTurn())
          && this.turnComplete.equals(that.turnComplete())
          && this.interrupted.equals(that.interrupted())
          && this.groundingMetadata.equals(that.groundingMetadata())
          && this.generationComplete.equals(that.generationComplete())
          && this.inputTranscription.equals(that.inputTranscription())
          && this.outputTranscription.equals(that.outputTranscription())
          && this.urlContextMetadata.equals(that.urlContextMetadata())
          && this.turnCompleteReason.equals(that.turnCompleteReason())
          && this.waitingForInput.equals(that.waitingForInput());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= modelTurn.hashCode();
    h$ *= 1000003;
    h$ ^= turnComplete.hashCode();
    h$ *= 1000003;
    h$ ^= interrupted.hashCode();
    h$ *= 1000003;
    h$ ^= groundingMetadata.hashCode();
    h$ *= 1000003;
    h$ ^= generationComplete.hashCode();
    h$ *= 1000003;
    h$ ^= inputTranscription.hashCode();
    h$ *= 1000003;
    h$ ^= outputTranscription.hashCode();
    h$ *= 1000003;
    h$ ^= urlContextMetadata.hashCode();
    h$ *= 1000003;
    h$ ^= turnCompleteReason.hashCode();
    h$ *= 1000003;
    h$ ^= waitingForInput.hashCode();
    return h$;
  }

  @Override
  public LiveServerContent.Builder toBuilder() {
    return new AutoValue_LiveServerContent.Builder(this);
  }

  static final class Builder extends LiveServerContent.Builder {
    private Optional<Content> modelTurn = Optional.empty();
    private Optional<Boolean> turnComplete = Optional.empty();
    private Optional<Boolean> interrupted = Optional.empty();
    private Optional<GroundingMetadata> groundingMetadata = Optional.empty();
    private Optional<Boolean> generationComplete = Optional.empty();
    private Optional<Transcription> inputTranscription = Optional.empty();
    private Optional<Transcription> outputTranscription = Optional.empty();
    private Optional<UrlContextMetadata> urlContextMetadata = Optional.empty();
    private Optional<TurnCompleteReason> turnCompleteReason = Optional.empty();
    private Optional<Boolean> waitingForInput = Optional.empty();
    Builder() {
    }
    Builder(LiveServerContent source) {
      this.modelTurn = source.modelTurn();
      this.turnComplete = source.turnComplete();
      this.interrupted = source.interrupted();
      this.groundingMetadata = source.groundingMetadata();
      this.generationComplete = source.generationComplete();
      this.inputTranscription = source.inputTranscription();
      this.outputTranscription = source.outputTranscription();
      this.urlContextMetadata = source.urlContextMetadata();
      this.turnCompleteReason = source.turnCompleteReason();
      this.waitingForInput = source.waitingForInput();
    }
    @Override
    public LiveServerContent.Builder modelTurn(Content modelTurn) {
      this.modelTurn = Optional.of(modelTurn);
      return this;
    }
    @Override
    LiveServerContent.Builder modelTurn(Optional<Content> modelTurn) {
      if (modelTurn == null) {
        throw new NullPointerException("Null modelTurn");
      }
      this.modelTurn = modelTurn;
      return this;
    }
    @Override
    public LiveServerContent.Builder turnComplete(boolean turnComplete) {
      this.turnComplete = Optional.of(turnComplete);
      return this;
    }
    @Override
    LiveServerContent.Builder turnComplete(Optional<Boolean> turnComplete) {
      if (turnComplete == null) {
        throw new NullPointerException("Null turnComplete");
      }
      this.turnComplete = turnComplete;
      return this;
    }
    @Override
    public LiveServerContent.Builder interrupted(boolean interrupted) {
      this.interrupted = Optional.of(interrupted);
      return this;
    }
    @Override
    LiveServerContent.Builder interrupted(Optional<Boolean> interrupted) {
      if (interrupted == null) {
        throw new NullPointerException("Null interrupted");
      }
      this.interrupted = interrupted;
      return this;
    }
    @Override
    public LiveServerContent.Builder groundingMetadata(GroundingMetadata groundingMetadata) {
      this.groundingMetadata = Optional.of(groundingMetadata);
      return this;
    }
    @Override
    LiveServerContent.Builder groundingMetadata(Optional<GroundingMetadata> groundingMetadata) {
      if (groundingMetadata == null) {
        throw new NullPointerException("Null groundingMetadata");
      }
      this.groundingMetadata = groundingMetadata;
      return this;
    }
    @Override
    public LiveServerContent.Builder generationComplete(boolean generationComplete) {
      this.generationComplete = Optional.of(generationComplete);
      return this;
    }
    @Override
    LiveServerContent.Builder generationComplete(Optional<Boolean> generationComplete) {
      if (generationComplete == null) {
        throw new NullPointerException("Null generationComplete");
      }
      this.generationComplete = generationComplete;
      return this;
    }
    @Override
    public LiveServerContent.Builder inputTranscription(Transcription inputTranscription) {
      this.inputTranscription = Optional.of(inputTranscription);
      return this;
    }
    @Override
    LiveServerContent.Builder inputTranscription(Optional<Transcription> inputTranscription) {
      if (inputTranscription == null) {
        throw new NullPointerException("Null inputTranscription");
      }
      this.inputTranscription = inputTranscription;
      return this;
    }
    @Override
    public LiveServerContent.Builder outputTranscription(Transcription outputTranscription) {
      this.outputTranscription = Optional.of(outputTranscription);
      return this;
    }
    @Override
    LiveServerContent.Builder outputTranscription(Optional<Transcription> outputTranscription) {
      if (outputTranscription == null) {
        throw new NullPointerException("Null outputTranscription");
      }
      this.outputTranscription = outputTranscription;
      return this;
    }
    @Override
    public LiveServerContent.Builder urlContextMetadata(UrlContextMetadata urlContextMetadata) {
      this.urlContextMetadata = Optional.of(urlContextMetadata);
      return this;
    }
    @Override
    LiveServerContent.Builder urlContextMetadata(Optional<UrlContextMetadata> urlContextMetadata) {
      if (urlContextMetadata == null) {
        throw new NullPointerException("Null urlContextMetadata");
      }
      this.urlContextMetadata = urlContextMetadata;
      return this;
    }
    @Override
    public LiveServerContent.Builder turnCompleteReason(TurnCompleteReason turnCompleteReason) {
      this.turnCompleteReason = Optional.of(turnCompleteReason);
      return this;
    }
    @Override
    LiveServerContent.Builder turnCompleteReason(Optional<TurnCompleteReason> turnCompleteReason) {
      if (turnCompleteReason == null) {
        throw new NullPointerException("Null turnCompleteReason");
      }
      this.turnCompleteReason = turnCompleteReason;
      return this;
    }
    @Override
    public LiveServerContent.Builder waitingForInput(boolean waitingForInput) {
      this.waitingForInput = Optional.of(waitingForInput);
      return this;
    }
    @Override
    LiveServerContent.Builder waitingForInput(Optional<Boolean> waitingForInput) {
      if (waitingForInput == null) {
        throw new NullPointerException("Null waitingForInput");
      }
      this.waitingForInput = waitingForInput;
      return this;
    }
    @Override
    public LiveServerContent build() {
      return new AutoValue_LiveServerContent(
          this.modelTurn,
          this.turnComplete,
          this.interrupted,
          this.groundingMetadata,
          this.generationComplete,
          this.inputTranscription,
          this.outputTranscription,
          this.urlContextMetadata,
          this.turnCompleteReason,
          this.waitingForInput);
    }
  }

}
