package com.busecnky.kasim16.Interface;

public class Arzum implements ITermometre, INemOlcer, ITarihSaatGoster{
								//Implements diyerek interfaceteki bütün maddeleri uygulayacağıma söz veriyorum.

	@Override
	public int sicakligiOlc() {
		return 24;
	}
	
	@Override
	public double nemOlc() {
		return 30.4;
	}

	@Override
	public String tarihGoster() {
		return "16 Kasım 2022";
	}

	@Override
	public String saatGoster() {
		return "11:25";
	}
	
	
	
		
}
