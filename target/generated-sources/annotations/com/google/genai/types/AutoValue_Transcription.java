package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Transcription extends Transcription {

  private final Optional<String> text;

  private final Optional<Boolean> finished;

  private AutoValue_Transcription(
      Optional<String> text,
      Optional<Boolean> finished) {
    this.text = text;
    this.finished = finished;
  }

  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return text;
  }

  @JsonProperty("finished")
  @Override
  public Optional<Boolean> finished() {
    return finished;
  }

  @Override
  public String toString() {
    return "Transcription{"
        + "text=" + text + ", "
        + "finished=" + finished
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Transcription) {
      Transcription that = (Transcription) o;
      return this.text.equals(that.text())
          && this.finished.equals(that.finished());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= text.hashCode();
    h$ *= 1000003;
    h$ ^= finished.hashCode();
    return h$;
  }

  @Override
  public Transcription.Builder toBuilder() {
    return new AutoValue_Transcription.Builder(this);
  }

  static final class Builder extends Transcription.Builder {
    private Optional<String> text = Optional.empty();
    private Optional<Boolean> finished = Optional.empty();
    Builder() {
    }
    Builder(Transcription source) {
      this.text = source.text();
      this.finished = source.finished();
    }
    @Override
    public Transcription.Builder text(String text) {
      this.text = Optional.of(text);
      return this;
    }
    @Override
    Transcription.Builder text(Optional<String> text) {
      if (text == null) {
        throw new NullPointerException("Null text");
      }
      this.text = text;
      return this;
    }
    @Override
    public Transcription.Builder finished(boolean finished) {
      this.finished = Optional.of(finished);
      return this;
    }
    @Override
    Transcription.Builder finished(Optional<Boolean> finished) {
      if (finished == null) {
        throw new NullPointerException("Null finished");
      }
      this.finished = finished;
      return this;
    }
    @Override
    public Transcription build() {
      return new AutoValue_Transcription(
          this.text,
          this.finished);
    }
  }

}
