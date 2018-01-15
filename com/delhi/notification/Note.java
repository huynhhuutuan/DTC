package com.delhi.notification;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Note implements Parcelable {
    public static final Creator<Note> CREATOR = new C03301();
    private String description;
    private String source;
    private String timestamp;
    private String title;
    private String url;

    static class C03301 implements Creator<Note> {
        C03301() {
        }

        public Note createFromParcel(Parcel source) {
            return new Note(source);
        }

        public Note[] newArray(int size) {
            return new Note[size];
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUid(String uid) {
        this.url = uid;
    }

    public String getTimeStamp() {
        return this.timestamp;
    }

    public void setTimeStamp(String time) {
        this.timestamp = time;
    }

    public void setSource(String src) {
        this.source = src;
    }

    public String getSource() {
        return this.source;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.timestamp);
        dest.writeString(this.source);
    }

    protected Note(Parcel in) {
        this.url = in.readString();
        this.title = in.readString();
        this.description = in.readString();
        this.timestamp = in.readString();
        this.source = in.readString();
    }

    public boolean equals(Object o) {
        boolean z = true;
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Note note = (Note) o;
        if (this.url != null) {
            if (!this.url.equals(note.url)) {
                return false;
            }
        } else if (note.url != null) {
            return false;
        }
        if (this.title != null) {
            if (!this.title.equals(note.title)) {
                return false;
            }
        } else if (note.title != null) {
            return false;
        }
        if (this.description != null) {
            z = this.description.equals(note.description);
        } else if (note.description != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int result;
        int hashCode;
        int i = 0;
        if (this.url != null) {
            result = this.url.hashCode();
        } else {
            result = 0;
        }
        int i2 = result * 31;
        if (this.title != null) {
            hashCode = this.title.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (i2 + hashCode) * 31;
        if (this.description != null) {
            i = this.description.hashCode();
        }
        return hashCode + i;
    }
}
