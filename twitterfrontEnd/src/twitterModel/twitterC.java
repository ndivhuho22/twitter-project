package twitterModel;
import java.util.List;
import java.util.stream.Collectors;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public class twitterC {
	public static void main(String[] args) throws TwitterException {
		Twitter twitter = config().getInstance();
		
		List<Status> status = twitter.getHomeTimeline();
		
		for(Status s:status){
			Status s;
			System.out.println(s.getUser().getName()+""+s.getText());
			
			twitter.getHomeTimeline().stream()
				      .map(item -> item.getText())
				      .collect(Collectors.toList());
		}

		postTweet("Hi ADH401T students");
		
		
	}


	public static TwitterFactory config() {
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		.setOAuthConsumerKey("IFJwDQUWLBI9CGn9J9kpKk2Cr")
		  .setOAuthConsumerSecret("2f4Jx7iSm21wXKdgMJDmHMp0Lrp4tY2Ta1JtuOgwDCAVF3COXh")
		  .setOAuthAccessToken("1183401312781848576-GspjKCAVe1rJgyZsWSbdlnzagvc2bZ")
		  .setOAuthAccessTokenSecret("KFK6PUN2EJcHb18am2xWnm8yJ92fC6aYhkKXisSG7LglC");
		
		TwitterFactory tf = new  TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
		return tf;
	}
	
	public static Status postTweet(String tweetText)throws TwitterException{
		Status status = null;
		Twitter twitter = config().getInstance();
		
		status = twitter.updateStatus(tweetText);
		
		System.out.println("Successfully update the status to ["+ status.getText()+"].");
		
		return status;
	} 
	
	public static String sendDirectMess(String receiverName, String msg)throws TwitterException{
		
		Twitter twitter = TwitterInstance();
		DirectMessage message = twitter.sendDirectMessage("@AdhLecturer", "[215245080] ADH Project");
		
		return message.getText();
	}


	private static Twitter TwitterInstance() {
		// TODO Auto-generated method stub
		return null;
	}
  }






