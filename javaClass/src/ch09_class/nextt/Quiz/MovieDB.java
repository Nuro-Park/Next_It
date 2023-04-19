package ch09_class.nextt.Quiz;

import java.util.ArrayList;

public class MovieDB {
	private ArrayList<Movie> movieList = new ArrayList<>();
	
	//싱글톤 패턴
	private MovieDB() {
		movieList.add(new Movie("신세계" , "거 죽기 딱 좋은 날씨네" , "이정재, 황정민, 박성웅" , "ㅅㅅㄱ"));
		movieList.add(new Movie("범죄와의 전쟁" , "느그 서장 남천동 살제?" , "최민식, 하정우" , "ㅂㅈㅇㅇㅈㅈ"));
		movieList.add(new Movie("카지노" , "쟤네를 왜 믿어? 돈을 믿어야" , "최민식 손석구 " , "ㅋㅈㄴ"));
		movieList.add(new Movie("아저씨" , "야 이 새끼야 이거 방탄유리야 이 개새끼야" , "원빈 김새론 김희원" , "ㅇㅈㅆ"));
		movieList.add(new Movie("악인전" , "재미있지? 사람 목숨 가지고 노는 거." , "마동석 김무역" , "ㅇㅇㅈ"));
		movieList.add(new Movie("범죄도시" , "진실의 방으로" , "마동석 윤계상" , "ㅂㅈㄷㅅ"));
		movieList.add(new Movie("범죄도시2" , "너 납치된 거야" , "마동석 손석구" , "ㅂㅈㄷㅅ2"));
		movieList.add(new Movie("내부자들" , "모히또 가서 몰디브 한 잔" , "이병헌 조승우" , "ㄴㅂㅈㄷ"));
		movieList.add(new Movie("태극기 휘날리며" , "돌아온다고 했잖아요" , "장동건 원빈 최민식" , "ㅌㄱㄱ ㅎㄴㄹㅁ"));
		 
	}
	private static MovieDB instance = new MovieDB();
	
	public static MovieDB getInstance() {
		return instance;
	}
	
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}
}
