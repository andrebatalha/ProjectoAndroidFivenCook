package com.example.atecdroid.fivencook.modelo;

import com.example.atecdroid.fivencook.R;
import com.example.atecdroid.fivencook.modelo.Receita;

import java.util.ArrayList;

public class BaseDados {

    public static ArrayList <Categoria> getData() {


        ArrayList<Categoria> receitas = new ArrayList<>();

            /*
                Sopa
             */
        Categoria sopas = new Categoria("Sopa", R.drawable.image1);

        Receita caldoverde = new Receita("Caldo Verde", "4 batatas médias", "1 tablete de caldo de galinha", "5 xícaras (chá) de água", "1 xícara (chá) de couve manteiga cortada em tiras", "1 lingüiça calabresa defumada cortada em rodelas", "Na panela de pressão, coloque a batata, caldo de galinha, óleo, água e sal.\nCozinhe por cerca de 10 minutos, começar a contar o tempo depois que a panela começar a chiar, até a batata desmanchar.\nEm seguida, bata tudo no liquidificador.\nAcrescente as rodelas de calabresa e ferva.\nDesligue o fogo e adicione a couve manteiga.\nNa hora de servir, coloque um fio de azeite ou croutons.", "sopas", R.drawable.image6);
        sopas.addReceita(caldoverde);

        Receita sopacenoura = new Receita("Sopa de Cenoura", "2 cenouras grandes", "2 batatas médias", "1 cebola média", "2 tomates sem pele e sem sementes", "1/2 peito de frango", "Em uma panela, pique as cenouras, as batatas, a cebola e os tomates.\nCorte o peito em 3 pedaços e coloque na panela.\nCubra com água e leve ao fogo baixo por 1 hora.\nRetire os pedaços de frango tirando os ossos e a pele.\nDesfie um dos pedaços do frango.\nEm um liquidificador, bata todo o conteúdo da panela, juntamente com os 2 pedaços inteiros do frango.\nVolte o conteúdo para a panela, adicionando o sal, a salsa e o frango desfiado.\nDeixe cozinhar por mais 5 minutos.", "sopas", R.drawable.image7);
        sopas.addReceita(sopacenoura);

        Receita sopaalho = new Receita("Sopa de Alho", "2 unidade(s) de alho-poró", "4 unidade(s) de batata", "1 colher(es) (café) de sal", "2 unidade(s) de gema de ovo", "1/2 garrafa(s) de creme de leite fresco", "Lave o alho-poró, corte em 4 no sentido do comprimento e pique-o.\nDescasque e pique as batatas.\nLeve tudo ao fogo em água com sal.\nDeixe cozinhar até, que as batatas e o alho-poró estejam quase desmanchados.\nPasse pelo espremedor de batatas.\nBata as gemascom o creme de leite numa tigelinha à parte.\nAcrescente 1 concha de caldo para dissolver bem.\nMisture à sopa e sirva a seguir com os pedacinhos de pão torrado.", "sopas", R.drawable.image8);
        sopas.addReceita(sopaalho);


        receitas.add(sopas);

            /*
                Saladas
             */
        Categoria saladas = new Categoria("Saladas", R.drawable.image2);

        Receita saladatropical= new Receita("Salada Tropical", "Alface e Tomate Cereja", "Rúcula", "Agrião", "Morangos", "Manga","Higienize muito bem todas as verduras e frutas.\nSepare as folhas das verduras e pique as frutas.\nDisponha em uma saladeira nessa ordem: alface, rúcula, agrião, tomate, uva, morango e manga.\nMisture todos os ingredientes e sirva à parte.","saladas", R.drawable.image9);
        saladas .addReceita(saladatropical);

        Receita saladaalface= new Receita("Salada Simples de Alface", "1 pé de alface", "1 xícara (chá) de creme de leite fresco", "4 colheres (sopa) de queijo ralado", "1 xícara (chá) de suco de limão", "1/2 maço de cheiro verde picadinho", "Separe as folhas de alface e lave-as.\nEscorra bem e corte em tirinhas.\nColoque numa saladeira.\nBata o creme de leite com o queijo até obter uma pasta.\nJunte o limão e o cheiro verde e tempere com sal e pimenta do reino.\nDespeje o molho sobre a alface, mexa bem e sirva.\nPode-se acrescentar ao molho 1 dente de alho picado.","saladas", R.drawable.image10);
        saladas .addReceita(saladaalface);

        Receita saladaatum= new Receita("Salada de Atum", "1/2 cebola média picada", "1 colher (sopa) de azeite", "2 tomates sem sementes em cubos", "1 lata de atum conservado em água escorrida", "Folhas de 1 pé de alface americana", "Misture todos os ingredientes, exceto a alface em um recipiente.\nCubra com papel filme e leve à geladeira por 2 horas.\nEm uma saladeira, arrume as folhas de alface e espalhe a salada de atum por cima.\nSirva em seguida.","saladas", R.drawable.image11);
        saladas .addReceita(saladaatum);

        receitas.add(saladas);

            /*
                Carnes
             */
        Categoria carnes = new Categoria("Carnes", R.drawable.image3);

        Receita frangofrito= new Receita("Frango Frito", "1 kg de frango cortado em pedaços pequenos", "1 xícara (chá) de vinagre", "Sal e pimenta-do-reino a gosto", "1 dente de alho amassado", "1/2 xícara (chá) de óleo", "Regue os pedaços de frango com o vinagre e, em seguida, lave-os em água corrente.\nSegue com papel toalha e tempere-os com o sal, a pimenta e o alho amassado.\nÀ parte, aqueça o óleo e frite os pedaços de frango até ficarem dourados dos dois lados (cerca de 20 minutos).\nRetire com o auxílio de uma escumadeira e deixe escorrer sobre papel toalha.\nSirva em seguida.","carnes", R.drawable.image12);
        carnes .addReceita(frangofrito);

        Receita arrozpato= new Receita("Arroz de Pato", "1 Pato", "400 g arroz agulha", "1/2 chouriço", "30 g pinhões", "50g sultanas douradas", "Retire a pele ao chouriço e coloque-o juntamente com o pato na panela de pressão. Cubra com água e tempere com sal. Leve a cozer durante cerca de 50 minutos, após levantar pressão.\nAbra a panela depois de ter deixado escapar toda a pressão e escorra o pato e o chouriço. Retire todas as peles, gorduras e ossos e desfie o pato.\nIntroduza então o arroz e, logo que retomar fervura, junte os pinhões e as sultanas. Retire do lume e deite 1/3 do arroz num tabuleiro que possa ir ao forno e à mesa. Sobre ele espalhe metade do pato desfiado e, por cima, mais 1/3 do arroz. Disponha por cima o restante pato desfiado e cubra com o restante arroz e respectivo caldo.\nDurante cerca de 20 minutos ou até o arroz ganhar uma crosta dourada e estaladiça.","carnes", R.drawable.image13);
        carnes .addReceita(arrozpato);

        Receita rolocarne= new Receita("Rolo de Carne", "500g de carne picada", "1 chouriço pequeno", "100g de bacon", "6 fatias de fiambre", "6 fatias de queijo", "Coloque a carne picada numa tigela.\nDe seguida pique 1º a cebola e os alhos e junte a carne picada, depois pique o chouriço e o bacon, e junte também a carne picada.\nAdicione um ovo inteiro. Tempere com o sal, a pimenta e a noz-moscada e orégãos.\nAmassa-se tudo e vai-se adicionando pão ralado até ficar uma massa homogénea.\nCorte uma folha de papel de alumínio e coloque numa bancada e polvilhe com pão ralado, espalme a massa e faça um rectângulo.\nPor cima da massa coloque as fatias de queijo, sobreponha as fatias de fiambre e depois as fatias de chourição. Enrole em forma de rolo.\nUnte um tabuleiro com manteiga e coloque o rolo, e junte o cubo de caldo desfeito numa chávena de chá com água quente, o vinho branco, as folhas de louro e a margarina.\nLeve ao forno previamente aquecido a 180ºgraus, durante aproximadamente 60 minutos.","carnes", R.drawable.image14);
        carnes .addReceita(rolocarne);


        receitas.add(carnes);


             /*
                Peixe
             */
        Categoria peixes = new Categoria("Peixes", R.drawable.image4);

        Receita bacalhauabras= new Receita("Bacalhau á Brás", " 1 emb. migas de bacalhau", "1 emb. batata palha", "12 ovos", "2 cebola(s) ", "6 dente(s) de alho", "Demolhe as migas de bacalhau em água corrente. Escorra bem.\nColoque o bacalhau dentro de uma pano e esfregue para desfiar muito bem.\nPique as cebolas e os dentes de alho, finamente, e deixe alourar no azeite.\nJunte o bacalhau. Adicione a batata palha, mexa muito bem e deixe aquecer.\nÀ parte, bata energicamente os ovos, temperados com pimenta moída e deite no tacho.\n\t5.1 Envolva bem, mexendo sempre com uma colher de pau, até os ovos começarem a coagular.\nPolvilhe com salsa picada e decore com azeitonas pretas.","peixes", R.drawable.image15);
        peixes .addReceita(bacalhauabras);

        Receita linguado= new Receita("Linguado Grelhado", "  4 linguado(s) médio", "1 c. chá molho inglês", "2 folha(s) de louro", "1 pitada pimenta preta moída", " 4 c. sopa queijo parmesão ralado", "Ligue o grelhador. Derreta a manteiga num tacho pequeno sobre lume brando.\nJunte o molho inglês, o sal, as folhas de louro, a pimenta e o queijo. Misture.\nDeite 1/2 do molho ainda quente no fundo do tabuleiro do grelhador e por cima coloque os linguados. Regue com o restante molho.\nDeixe grelhar os linguados, sem virar durante 5 minutos ou mais conforme a espessura do peixe.","peixes", R.drawable.image16);
        peixes .addReceita(linguado);


        Receita salmao= new Receita("Rolinhos de Salmão Fumado", " Salmão Fumado", "Philadelphia(light)", "Limão", "Salsa", " ", "Numa tábua, estender uma fatia de Salmão, ponta mais grossa para nós.\nEspalhar uma camada fina de Philadelphia, polvilhar levemente com Salsa e umas gotas de Limão.\nCuidadosamente enrolar a fatia em direcção à ponta mais fina.\nCortar a meio e servir.","peixes", R.drawable.image17);
        peixes .addReceita(salmao);

        receitas.add(peixes);


             /*
                Sobremesas
             */
        Categoria sobremesas = new Categoria("Sobremesas", R.drawable.image5);

        Receita tortacenoura= new Receita("Torta de Cenoura", "500 gr de cenoura ", "400 gr de açúcar ", "4 ovos", "4 colheres de sopa de farinha (c/fermento) ", "1 laranja ", "Comece por cozer as cenouras, e passá-las. Depois de moer as cenouras, e estas estarem escorridas, juntar o açúcar, a raspa e o sumo da laranja e os ovos inteiros, e bater com a batedeira, por fim juntar a farinha, e voltar a bater mais um pouco.\nDeitar o preparado num tabuleiro, forrado com papel vegetal (este untado e polvilhado de farinha), deixar cozer cerca de 20 minutos em lume médio.\nDepois de verificar que está cozida (atenção que a torta deve ficar mais para o mal cozido, ou seja tipo pudim, quando se espeta o palito este deve sair ligeiramente húmido), deitar a torta sobre um pano polvilhado de açúcar, tirar o papel vegetal, polvilhar com canela e depois ir enrolando a torta com a ajuda do pano. ","sobremesas", R.drawable.image18);
        sobremesas .addReceita(tortacenoura);

        Receita bolobolacha= new Receita("Bolo de Bolacha", "2 emb. bolacha-maria ", "4 gema(s) de ovo ", "125 g manteiga", "250 g açúcar", "1 caneca café muito forte ", "Bater as gemas, o açúcar e a manteiga muito bem até a mistura ficar cremosa.\nFazer café forte e passe as bolachas, uma a uma pelo café, não muito quente, e deixam-se arrefecer.\nColoca-se uma primeira fiada de bolachas num prato, como por exemplo em forma de flor, e depois barra-se com o creme.\nDepois volta-se a colocar outra fiada de bolachas embebidas em café e depois o creme, e assim sucessivamente\nPor fim barra-se o bolo por fora e polvilha-se com bolacha ralada.","sobremesas", R.drawable.image19);
        sobremesas .addReceita(bolobolacha);

        Receita pudimovos= new Receita("Pudim de Ovos", "6 ovos", "6 gemas ", "180 ml de água", "375 g de açucar", "caramelo de compra", "Comece por bater os ovos com as gemas e reserve.\nNum tacho, coloque a água juntamente com o açucar e leve ao lume até ferver.\nDe seguida, junte o preparado da água com o açucar ao ovos e mexa muito bem.\nAdicione a raspa e o sumo de laranja. Mexa tudo novamente e verta para a forma de pudim previamente untada com o caramelo.\nLeve ao forno, a 180ºC em banho-maria. No meu forno demorou cerca de 45 minutos.\nDepois de cozido, retire do forno e desenforme apenas quando estiver totalmente frio.","sobremesas", R.drawable.image20);
        sobremesas .addReceita(pudimovos);

        receitas.add(sobremesas);

        return receitas;


    }


}
