package com.anilyilmaz.notebook.listeners;

import com.anilyilmaz.notebook.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
