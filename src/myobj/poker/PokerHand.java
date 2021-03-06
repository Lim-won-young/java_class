package myobj.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;



public class PokerHand implements Comparable<PokerHand>{
	
	ArrayList<PokerCard> hands;
	
	boolean[] opens;
	
	public PokerHand(int handSize) {
		hands = new ArrayList<>(handSize);
		opens = new boolean[handSize];
		
		for (int i = 0; i < handSize; i++) {
			if(i < 2) {
				opens[i] = false;
			}
			else {
				opens[i] = true;
			}
		}
		
	}
	
	public void add(PokerCard card) {
		hands.add(card);
	}
	
	public void show() {
		for (int i = 0; i < hands.size(); i++) {
			System.out.print((i+1) + "번째 카드 : ");
			if (opens[i]) {
				System.out.print(hands.get(i));
			}
			else {
				System.out.print("NOT OPENED");
			}
			System.out.println();
		}
	}
	
	public void open(int hand_index) {
		opens[hand_index] = !opens[hand_index];
	}
	
	Set<Rank> getRankSet() {
		Set<Rank> ranks = new HashSet<>();
		
		for (PokerCard hand : hands) {
			ranks.add(hand.rank);
		}
		return ranks;
	}
	
	public void openAllCard() {
		Arrays.fill(opens, true);
	}
	
	@Override
	public int compareTo(PokerHand o) {
		PokerHandRanking rank1 = new PokerHandRanking(this);
		PokerHandRanking rank2 = new PokerHandRanking(o);
		
		System.out.println("플레이어 1 : " + rank2.getHandRank());
		System.out.println("플레이어 2 : " + rank1.getHandRank());
		
		return rank1.getHandRank().compareTo(rank2.getHandRank());
	}
	
	
	
	public static void main(String[] args) {
		
		PokerDeck deck = new PokerDeck();
		PokerHand player01 = new PokerHand(5);
		player01.add(deck.draw());
		player01.add(deck.draw());
		player01.add(deck.draw());
		player01.add(deck.draw());
		player01.add(deck.draw());
		
		
		PokerHand player02 = new PokerHand(5);
		player02.add(deck.draw());
		player02.add(deck.draw());
		player02.add(deck.draw());
		player02.add(deck.draw());
		player02.add(deck.draw());
		
		System.out.println("player01's deck");
		player01.openAllCard();
		player01.show();
		
		System.out.println("player01's deck");
		player02.openAllCard();
		player02.show();
		
		ArrayList<PokerHand> players = new ArrayList<>();
		players.add(player01);
		players.add(player02);
		
		System.out.println("이긴 사람 : " + Collections.max(players).hands);
			
			
	}


		
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

