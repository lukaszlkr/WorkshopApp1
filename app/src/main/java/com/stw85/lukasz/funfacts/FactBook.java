package com.stw85.lukasz.funfacts;

import java.util.Random;

/**
 * Created by Lukasz on 15.06.15.
 */
public class FactBook {

    public String[] facts = {

            "Choć wydaje nam się, że niemowlę jest bardzo nieporadne, to jednak potrafi ono zdobyć pożywienie. Noworodek, którego położy się na brzuchu mamy, powoli, ale wytrwale będzie pełzać w kierunku jej piersi. Kiedy do nich dotrze, bez pomocy się przyssie i spokojnie będzie pić mleko. Innymi slowy dziecio chce cyca ;-)",
            "Najsilniej rozwiniętym zmysłem noworodka jest dotyk. Nieprzypadkowo na dzieci urodzone przed terminem, przytulanie i głaskanie działa jak terapia. Maluch rozpoznaje osoby po sposobie, w jaki je dotykają czy głaszczą. Zalecana wyjątkowa delikatnosc ;-)",
            "Wrażliwość noworodka na zapachy jest znacznie większa niż u człowieka dorosłego. W związku z tym warto zrezygnować z perfum, balsamów czy dezodorantów o intensywnym zapachu. Nie smrodzić ;-)",
            "Silna woń środków chemicznych może źle wpływać na samopoczucie maleństwa. W czasie pierwszych tygodni po przyjściu na świat, uczy się ono zapachu rodziców. ;-)",
            "Najprzyjemniejszym dźwiękiem dla niemowlęcia jest głos człowieka i brzmienie ludzkiej mowy. Dlatego dzieci uspokajają się, gdy mówi się do nich spokojnie, nawet gdy jeszcze nie rozumieją treści komunikatu. Milo i przyjemnie ;-)",
            "Okazało się, że powikłania sercowe i oddechowe występowały znacznie rzadziej u noworodków, które mogły słuchać przynajmniej nagranego głosu matki, w porównaniu z maluchami, które odbierały tylko dźwięki dochodzące z sal szpitalnych. ;-)",
            "Niemowlę jest bardzo wrażliwe na temperaturę. Kiedy marznie, zaczyna energicznie się ruszać, a kiedy jest mu ciepło, leży jak na plaży: z szeroko rozłożonymi rączkami i nóżkami. ;-)",
            "Mamy noworodków są w stanie odróżnić płacz swojego dziecka od płaczu innych niemowląt (np. na sali poporodowej) już na drugi dzień po porodzie. Ewolucja wymyśliła tę sztuczkę, aby matki nie myliły noworodków, które po przyjściu na świat są do siebie bardzo podobne. To bardzo ciekawe ;-) ",
            "W pierwszych latach życia większość dzieci jest oburęczna. Dopiero między 4 a 6 rokiem życia następuje lateralizacja, a więc wykształca się w dziecku dominacja którejś strony ciała. Prawa lub majkut ;-)",
            "Mózg dziecka najintensywniej rozwija się przez pierwsze trzy lata życia. Dlatego mówi się o pierwszym tysiącu dni, które są kluczowe dla rozwoju dziecka. Już nigdy później człowiek nie nauczy się tylu rzeczy, co w tych pierwszych trzech latach. Świat stanął na głowie ;-)"






    };

            /*
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."};
            */


    public String getFact() {


        // button was clicked so update the fact label new fact
        //String fact = "Ostriches can run faster than horses.";

        String fact = "";
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);

        fact = facts[randomNumber];

        return fact;
    }

}
