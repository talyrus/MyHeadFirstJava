package com.taly.MiniMiniMusicApp;

import javax.sound.midi.*;

/**
 * Created by Taly on 14.03.2018.
 */
public class MiniMiniMusicApp {
	public static void main(String[] args) {
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();
	}//  закрываем main

	public void play(){
		try {
			Sequencer player = MidiSystem.getSequencer();   //получаем синтезатор
			player.open(); // открываем его, чтобы начать использовать

			Sequence seq = new Sequence(Sequence.PPQ, 4); // создадим последовательность

			Track track = seq.createTrack(); // заправшиваем трек у последовательности
			// трек находится внутри последовательности, а MIDI-данные - в треке

			ShortMessage a = new ShortMessage();    // помещаем в трек MIDI-события
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOne = new MidiEvent(a, 1);
			track.add(noteOne);

			ShortMessage b = new ShortMessage();    // помещаем в трек MIDI-события
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);

			player.setSequence(seq); // передаем последовательность синтезатору

			player.start(); // запускаем синтезатор
		} catch (Exception ex){
			ex.printStackTrace();
		}
	} // закрываем play
} // закрываем класс
