package carly;

public class CallMeMaybe implements song {
	
	Human singlePerson = new Human();
	Human guy = new Human();

	public static void main(String[] args) throws NumberNotGivenException{
		new CallMeMaybe().startSong();
	}
	
	public music startSong() throws NumberNotGivenException{

		singlePerson.setGender(Gender.FEMALE);
		guy.setGender(Gender.MALE);
				

		//verse 1
		Wish w = new Wish();
		
		singlePerson.throwWish(w, singlePerson.getLocation().getNearestWell());
		singlePerson.setMute(true);
		
		while(w.isFalling()){
			singlePerson.setFacing(guy);
		}
		
		guy.block(singlePerson);
		
		//verse 2
		singlePerson.trade(singlePerson.getSoul(), w = new Wish());
		singlePerson.trade(new Money(singlePerson.getPennies().getAmount(), singlePerson.getDimes().getAmount()), new Kiss());
		
		if(singlePerson.isLooking("for this"))
			singlePerson.setLooking(null);
		
		guy.block(singlePerson);
		guy.stare(singlePerson);
		guy.setJeans(Jeans.RIPPED);
		guy.getSkin().showThrough(guy.getJeans());
		Enviroment.getEnviroment().setEnviroment(Enviroment.HOT);
		Time.getTime().setTime(Time.NIGHT);
		Enviroment.getEnviroment().setWindSpeed(Wind.NORMAL_BLOWING);
		
		guy.setLocation(singlePerson.getLocation());
		
		//verse 3&4
		hey_I_Just_Met_You();
		hey_I_Just_Met_You();
		
		//verse 5
		guy.callAfter(Time.LONGTIME, call(guy.getNewestNumber()));
		singlePerson.setTimeAfter(Time.NONE, Action.FALL);
		guy.give(null, singlePerson);
		guy.block(singlePerson);
		singlePerson.beg(guy);
		singlePerson.borrow(guy.getRandomObject());
		singlePerson.steal(guy.getRandomObject());
		
		new Listener(Actions.SEE){
			public Reality onSight(){
				return Reality.REAL;
			}
		};
		
		singlePerson.setOblivious(singlePerson.getIt());
		((Human) singlePerson.getIt()).block(singlePerson);

		//verse 6		
		guy.stare(singlePerson);
		guy.setJeans(Jeans.RIPPED);
		guy.getSkin().showThrough(guy.getJeans());
		Enviroment.getEnviroment().setEnviroment(Enviroment.HOT);
		Time.getTime().setTime(Time.NIGHT);
		Enviroment.getEnviroment().setWindSpeed(Wind.NORMAL_BLOWING);

		guy.setLocation(singlePerson.getLocation());

		//verse 7&8
		hey_I_Just_Met_You();
		hey_I_Just_Met_You(generateRandomGroup(Type.BOY));

		//verse strongest
		Time.setTime(Time.BEFORE);
		singlePerson.setFeelingsTo(Feelings.MISSING, guy);
		singlePerson.setFeelingStrength(singlePerson.getFeelingsTo(guy).toStrength() * 2);
		Time.setTime(Time.BEFORE);
		singlePerson.setFeelingsTo(Feelings.MISSING, guy);
		guy.giveKnowledge(singlePerson.getFeelingsTo(guy));
		singlePerson.setFeelingsTo(Feelings.MISSING, guy);

		//verse 10
		singlePerson.setDifficultyToLookAt(Difficulty.HARD, guy);
		singlePerson.give((Object)singlePerson.getNumber(), guy);
		guy.setPossibility(call(guy.getNewestNumber()));

		//verse 11
		hey_I_Just_Met_You(generateRandomGroup(Type.BOY));

		//verse 12
		Time.setTime(Time.BEFORE);
		singlePerson.setFeelingsTo(Feelings.MISSING, guy);		
		singlePerson.setFeelingStrength(singlePerson.getFeelingsTo(guy).toStrength() * 2);
		singlePerson.setFeelingStrength(singlePerson.getFeelingsTo(guy).toStrength() * 4);
		guy.giveKnowledge(singlePerson.getFeelingsTo(guy));
		guy.setPossibility(call(guy.getNewestNumber()));
		
		//verse 13 (it's not in the song, but in the video itself)
		guy.giveNumber(new Human().setGender(Gender.MALE));
		
		return null;
	}

	private Boy[] generateRandomGroup(Type boy) {
		return new Boy[]{new Boy(), new Boy()};
	}

	private Object call(Object newestNumber) {
		return null;
	}

	public Number hey_I_Just_Met_You() throws NumberNotGivenException {
		singlePerson.setMood(Mood.CRAZY);
		singlePerson.give((Object)singlePerson.getNumber(), guy);
		guy.setPossibility(call(guy.getNewestNumber()));
		singlePerson.setDifficultyToLookAt(Difficulty.HARD, guy);
		singlePerson.give((Object)singlePerson.getNumber(), guy);
		guy.setPossibility(call(guy.getNewestNumber()));
		return (Number) guy.getNumber();
	}

	public Number hey_I_Just_Met_You(Boy[] ba) throws NumberNotGivenException {
		singlePerson.setMood(Mood.CRAZY);
		singlePerson.give((Object)singlePerson.getNumber(), guy);
		guy.setPossibility(call(guy.getNewestNumber()));
		
		for(Boy b : ba){
			b.chase(singlePerson);
		} 
		
		singlePerson.give((Object)singlePerson.getNumber(), guy);
		guy.setPossibility(call(guy.getNewestNumber()));
		return (Number) guy.getNumber();
	}

}