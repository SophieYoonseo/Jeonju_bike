package kr.go.csejeonju2019;

//19.09.23 MrJANG: for KAKAO
public class KakaoAccount
{
    public String AccessToken, AccessTime, LoginType;

    public KakaoAccount(String token, String time, String type)
    {
        this.AccessToken = token;
        this.AccessTime = time;
        this.LoginType = type;
    }
}