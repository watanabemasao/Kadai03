package com.example.springboot_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication  //*1
@RestController  //*2
public class SpringBootHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }

    @RestController
    public static class Hello {
        @RequestMapping("/hello")  //*3
        String hello() {
            return "HelloWorld";  //*4
        }
    }
}

        //*1 このクラスがあるパッケージ以下をスキャンして
        //        @Configurationや@Component等のbean自動登録を行ってくれる。

        //*2 リクエストを受け、JSONやXMLを返すAPIサーバー用として使用
        //        メソッドの戻り値はView名ではなくJavaオブジェクトなどのレスポンスボディ
        //        用途:APIサーバー用　メソッドの戻り値:JsonやXML

        //*3 アノテーションの属性の指定:
        //         value属性  メソッドやクラスに紐づけるURLのパスを指定する属性(省略可能)

        //*4 returnの文法
        //         戻り値の型　メソッド名(){
        //         処理;
        //         return 値;


