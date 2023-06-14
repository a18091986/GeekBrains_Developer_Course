import os
import json

class NotesList:
    def __init__(self, path: os.path):
        if os.path.exists('notes_list.json'):
            with open ('notes_list.json') as f:
                notes = json.load(f)
        else:
            os.path.
        



class Note:

    def __init__(self, id, title, body, creation_date_time, modification_date_time) -> None:
        self.id = id
        self.title = title
        self.body = body
        self.creation_date_time = creation_date_time
        self.modification_date_time = modification_date_time

