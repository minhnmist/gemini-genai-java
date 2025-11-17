package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_LiveClientRealtimeInput extends LiveClientRealtimeInput {

  private final Optional<List<Blob>> mediaChunks;

  private final Optional<Blob> audio;

  private final Optional<Boolean> audioStreamEnd;

  private final Optional<Blob> video;

  private final Optional<String> text;

  private final Optional<ActivityStart> activityStart;

  private final Optional<ActivityEnd> activityEnd;

  private AutoValue_LiveClientRealtimeInput(
      Optional<List<Blob>> mediaChunks,
      Optional<Blob> audio,
      Optional<Boolean> audioStreamEnd,
      Optional<Blob> video,
      Optional<String> text,
      Optional<ActivityStart> activityStart,
      Optional<ActivityEnd> activityEnd) {
    this.mediaChunks = mediaChunks;
    this.audio = audio;
    this.audioStreamEnd = audioStreamEnd;
    this.video = video;
    this.text = text;
    this.activityStart = activityStart;
    this.activityEnd = activityEnd;
  }

  @JsonProperty("mediaChunks")
  @Override
  public Optional<List<Blob>> mediaChunks() {
    return mediaChunks;
  }

  @JsonProperty("audio")
  @Override
  public Optional<Blob> audio() {
    return audio;
  }

  @JsonProperty("audioStreamEnd")
  @Override
  public Optional<Boolean> audioStreamEnd() {
    return audioStreamEnd;
  }

  @JsonProperty("video")
  @Override
  public Optional<Blob> video() {
    return video;
  }

  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return text;
  }

  @JsonProperty("activityStart")
  @Override
  public Optional<ActivityStart> activityStart() {
    return activityStart;
  }

  @JsonProperty("activityEnd")
  @Override
  public Optional<ActivityEnd> activityEnd() {
    return activityEnd;
  }

  @Override
  public String toString() {
    return "LiveClientRealtimeInput{"
        + "mediaChunks=" + mediaChunks + ", "
        + "audio=" + audio + ", "
        + "audioStreamEnd=" + audioStreamEnd + ", "
        + "video=" + video + ", "
        + "text=" + text + ", "
        + "activityStart=" + activityStart + ", "
        + "activityEnd=" + activityEnd
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LiveClientRealtimeInput) {
      LiveClientRealtimeInput that = (LiveClientRealtimeInput) o;
      return this.mediaChunks.equals(that.mediaChunks())
          && this.audio.equals(that.audio())
          && this.audioStreamEnd.equals(that.audioStreamEnd())
          && this.video.equals(that.video())
          && this.text.equals(that.text())
          && this.activityStart.equals(that.activityStart())
          && this.activityEnd.equals(that.activityEnd());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= mediaChunks.hashCode();
    h$ *= 1000003;
    h$ ^= audio.hashCode();
    h$ *= 1000003;
    h$ ^= audioStreamEnd.hashCode();
    h$ *= 1000003;
    h$ ^= video.hashCode();
    h$ *= 1000003;
    h$ ^= text.hashCode();
    h$ *= 1000003;
    h$ ^= activityStart.hashCode();
    h$ *= 1000003;
    h$ ^= activityEnd.hashCode();
    return h$;
  }

  @Override
  public LiveClientRealtimeInput.Builder toBuilder() {
    return new AutoValue_LiveClientRealtimeInput.Builder(this);
  }

  static final class Builder extends LiveClientRealtimeInput.Builder {
    private Optional<List<Blob>> mediaChunks = Optional.empty();
    private Optional<Blob> audio = Optional.empty();
    private Optional<Boolean> audioStreamEnd = Optional.empty();
    private Optional<Blob> video = Optional.empty();
    private Optional<String> text = Optional.empty();
    private Optional<ActivityStart> activityStart = Optional.empty();
    private Optional<ActivityEnd> activityEnd = Optional.empty();
    Builder() {
    }
    Builder(LiveClientRealtimeInput source) {
      this.mediaChunks = source.mediaChunks();
      this.audio = source.audio();
      this.audioStreamEnd = source.audioStreamEnd();
      this.video = source.video();
      this.text = source.text();
      this.activityStart = source.activityStart();
      this.activityEnd = source.activityEnd();
    }
    @Override
    public LiveClientRealtimeInput.Builder mediaChunks(List<Blob> mediaChunks) {
      this.mediaChunks = Optional.of(mediaChunks);
      return this;
    }
    @Override
    LiveClientRealtimeInput.Builder mediaChunks(Optional<List<Blob>> mediaChunks) {
      if (mediaChunks == null) {
        throw new NullPointerException("Null mediaChunks");
      }
      this.mediaChunks = mediaChunks;
      return this;
    }
    @Override
    public LiveClientRealtimeInput.Builder audio(Blob audio) {
      this.audio = Optional.of(audio);
      return this;
    }
    @Override
    LiveClientRealtimeInput.Builder audio(Optional<Blob> audio) {
      if (audio == null) {
        throw new NullPointerException("Null audio");
      }
      this.audio = audio;
      return this;
    }
    @Override
    public LiveClientRealtimeInput.Builder audioStreamEnd(boolean audioStreamEnd) {
      this.audioStreamEnd = Optional.of(audioStreamEnd);
      return this;
    }
    @Override
    LiveClientRealtimeInput.Builder audioStreamEnd(Optional<Boolean> audioStreamEnd) {
      if (audioStreamEnd == null) {
        throw new NullPointerException("Null audioStreamEnd");
      }
      this.audioStreamEnd = audioStreamEnd;
      return this;
    }
    @Override
    public LiveClientRealtimeInput.Builder video(Blob video) {
      this.video = Optional.of(video);
      return this;
    }
    @Override
    LiveClientRealtimeInput.Builder video(Optional<Blob> video) {
      if (video == null) {
        throw new NullPointerException("Null video");
      }
      this.video = video;
      return this;
    }
    @Override
    public LiveClientRealtimeInput.Builder text(String text) {
      this.text = Optional.of(text);
      return this;
    }
    @Override
    LiveClientRealtimeInput.Builder text(Optional<String> text) {
      if (text == null) {
        throw new NullPointerException("Null text");
      }
      this.text = text;
      return this;
    }
    @Override
    public LiveClientRealtimeInput.Builder activityStart(ActivityStart activityStart) {
      this.activityStart = Optional.of(activityStart);
      return this;
    }
    @Override
    LiveClientRealtimeInput.Builder activityStart(Optional<ActivityStart> activityStart) {
      if (activityStart == null) {
        throw new NullPointerException("Null activityStart");
      }
      this.activityStart = activityStart;
      return this;
    }
    @Override
    public LiveClientRealtimeInput.Builder activityEnd(ActivityEnd activityEnd) {
      this.activityEnd = Optional.of(activityEnd);
      return this;
    }
    @Override
    LiveClientRealtimeInput.Builder activityEnd(Optional<ActivityEnd> activityEnd) {
      if (activityEnd == null) {
        throw new NullPointerException("Null activityEnd");
      }
      this.activityEnd = activityEnd;
      return this;
    }
    @Override
    public LiveClientRealtimeInput build() {
      return new AutoValue_LiveClientRealtimeInput(
          this.mediaChunks,
          this.audio,
          this.audioStreamEnd,
          this.video,
          this.text,
          this.activityStart,
          this.activityEnd);
    }
  }

}
