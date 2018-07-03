public aspect DMaj {
	pointcut getKey() : execution(Pattern Key.getMelodyInKey());
	
	Pattern around() : getKey() {
		String melodyString = "Dq Eq Fq Gq | Ah Ah | Bq Bq Bq Bq | Ah Rh | Bq Bq Bq Bq | Ah Rh | Gq Gq Gq Gq | Fh Fh | Aq Aq Aq Aq | Dh";
		
		return new Pattern(melodyString);
	}
}
