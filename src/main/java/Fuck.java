import java.util.Random;
import java.util.Scanner;

//В строку аргумента знак зодиака вводить на русском с заглавной буквы.

public class Fuck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите знак зодиака");
        int b = input.nextInt();
        int a = (int) (Math.random()*2);

        runForExample(args);

        String zodiacs = input.next();

    }

    public static void runForExample(String[] names) {
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
            runIfExample(names);
        }
    }

    public static void runIfExample (String[] Random) {
        switch (Random) {
            Random random = new Random();
            int a = random.nextInt(2);
            case "Овен":
                if (a == 0)
                    System.out.println("Ответ: Вас ждет улучшение взаимоотношений с любимым человеком!");
                else
                    System.out.println("Ответ: Сегодня вы, возможно, столкнетесь с необходимостью отчаянно сопротивляться. Это занятие отнимет у вас массу сил и времени, зато закалит для последующих битв. ");
                break;


            case "Телец":
                if (a == 0)
                    System.out.println("Ответ: То, что долгое время дразнило вас, оставаясь абсолютно недосягаемым, сегодня утратит бдительность. У вас есть хороший шанс его поймать. Не зевайте. ");
                else
                    System.out.println("Ответ: Сегодня следует позаботиться о своем здоровье и не перегружать организм. ");
                break;


            case "Водолей":
                if (a == 0)
                    System.out.println("Ответ: Ваши личные приоритеты должны быть на первом месте, отстаивайте их. ");
                else
                    System.out.println("Ответ: От вас сегодня разве что искры лететь не будут, хотя и этого гарантировать нельзя. Вы будете привлекать всеобщее внимание, находиться в курсе всех дел. Если вы стремитесь к лидерству, то нынче легко его добьетесь.  ");
                break;


            case "Близнецы":
                if (a == 0)
                    System.out.println("Ответ: Постарайтесь свести до минимума личные контакты. Сегодня вы будете несколько несдержанны в эмоциональном отношении, так что, желая сохранить приемлемые отношения с окружающим миром, лучше пользоваться услугами бумаги или электронной почты, на худой конец - телефона. ");
                else
                    System.out.println("Ответ: Возможно, скоро произойдет событие, которое успешно повлияет на ваше будущее. ");
                break;


            case "Рак":
                if (a == 0)
                    System.out.println("Ответ: Дни будут богаты интересными событиями! Будете поражены. ");
                else
                    System.out.println("Ответ: Возможно вы желаете слишком многого и, что характерно, сразу. Сегодня стоит пересмотреть свои амбиции и, возможно, в чем-то их умерить. Ненадолго, разумеется.  ");
                break;


            case "Лев":
                if (a == 0)
                    System.out.println("Ответ: Куда бы вы ни шли, от себя вы все равно не убежите. Пришло время сесть и, не торопясь, с холодной головой, обдумать давнишнюю проблему. Это занятие настолько утомительно, что, когда вы закончите, найдите пару часов для отдыха. ");
                else
                    System.out.println("Ответ: Позаботьтесь о душевном равновесии и меньше тратьте энергию на всех.");
                break;


            case "Дева":
                if (a == 0)
                    System.out.println("Ответ: Скоро ваши старания заметят, и вы получите вознаграждение!");

                else
                    System.out.println("Ответ: Сегодня вам стоит быть максимально осмотрительным при проведении даже самых мелких финансовых операций. Возможно, их лучше вовсе не осуществлять. Назавтра вы сможете найти этим же деньгам куда лучшее применение.  ");
                break;


            case "Весы":
                if (a == 0)
                    System.out.println("Ответ: Сегодня вам придется попотеть, день будет не из легких. Могут возникнуть проблемы с деньгами, не катастрофические, но долготекущие. ");
                else
                    System.out.println("Ответ: Скоро появятся возможности для воплощения мечты!  ");
                break;


            case "Скорпион":
                if (a == 0)
                    System.out.println("Ответ: Вас ждет приятный период в любви. Ждите романтических встреч!");
                else
                    System.out.println("Ответ: Сегодня все будет говорить вам, что цель близка и осталось последнее усилие. Последним оно, естественно не будет, но не поддавайтесь разочарованию, если все не получится сразу.");
                break;


            case "Стрелец":
                if (a == 0)
                    System.out.println("Ответ: Подождите с клятвенными заверениями. Возможно, назавтра вам очень захочется взять свои слова назад.");
                else
                    System.out.println("Ответ: Вам нужен отдых, чтобы сохранить силы на будущие успешные проекты.");
                break;


            case "Козерог":
                if (a == 0)
                    System.out.println("Ответ: День лучше провести с близкими! Вам нужна перезагрузка.");
                else
                    System.out.println("Ответ: Сегодня вами будут владеть смешанные чувства. Возможно, вам придется и плакать и смеяться одновременно. Запаситесь валерьянкой.");
                break;


            case "Рыбы":
                if (a == 0)
                    System.out.println("Ответ: Вы сегодня будете в наилучшей форме. Окружающие будут с нетерпением и замиранием дыхания ожидать каждого вашего следующего шага. Можете разворачиваться на полную катушку, нынче должно получаться все.");
                else
                    System.out.println("Ответ: Хороший день для самоанализа и составления планов!");
                break;


            case "":
                throw new IllegalArgumentException("Ответ: Неверно введен знак зодиака");

        }

    }



        }



