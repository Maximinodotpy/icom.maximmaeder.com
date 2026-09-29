import ch.fhnw.prog1.exercise.pong.Ball;
import ch.fhnw.prog1.exercise.pong.Player;
import ch.trick17.gui.Gui;

static final int WIDTH = 800;
static final int HEIGHT = 400;
static final int PLAYER_X_MARGIN = 40;
static final int PLAYER_LENGTH = 150;
static final int PLAYER_WIDTH = 10;


void main() {
    Gui gui = Gui.create("Pong", WIDTH, HEIGHT);
    gui.open();

    // TODO: a) Player- und Ball-Klassen erstellen, hier
    //  Objekte davon erstellen

    int player_start_y = HEIGHT/2 - PLAYER_LENGTH/2;
    Player player_1 = new Player(PLAYER_X_MARGIN, player_start_y, "w", "s", PLAYER_LENGTH);
    Player player_2 = new Player(WIDTH - PLAYER_X_MARGIN - PLAYER_WIDTH, player_start_y, "up", "down", PLAYER_LENGTH);

    Ball[] balls = new Ball[100];
    balls[0] = new Ball(WIDTH/2, HEIGHT/2);

    Random random = new Random();

    while (gui.isOpen()) {
        // TODO: c) Players entsprechend den Tastatureingaben
        //  und Ball entsprechend seiner Geschwindigkeit bewegen
        // Beispiel-Aufrufe:

        player_1.process(gui);
        player_2.process(gui);

        player_1.render(gui);
        player_2.render(gui);

        // TODO: d) Kollisionen mit Wänden oben und unten

        for (int i = 0; i < balls.length; i++) {
            if (balls[i] == null) continue;

            Ball ball = balls[i];

            ball.process(gui);

            int ball_radius = 10;
            int next_ball_x = ball.x + ball.vel_x;
            if (next_ball_x > (WIDTH - ball_radius) || next_ball_x < (0 + ball_radius)) {
                IO.println("Ball Wall coll...");
                ball.vel_x *= -1;

                ball.x = WIDTH / 2;

                if (next_ball_x < ball_radius) {
                    player_2.points += 1;
                } else {
                    player_1.points += 1;
                }
            }

            // Spieler
            boolean player_coll = (
                // KANN MAN CHAINEN?
                player_1.y < ball.y && ball.y < (player_1.y + player_1.length) && next_ball_x < PLAYER_X_MARGIN
                ||
                player_2.y < ball.y && ball.y < (player_2.y + player_2.length) && next_ball_x > (WIDTH - PLAYER_X_MARGIN)
            );

            if (player_coll) {
                IO.println("Player coll...");
                ball.vel_x *= -1;

                ball.vel_y = random.nextInt(4);
            }

            int next_ball_y = ball.y + ball.vel_y;
            if (next_ball_y > HEIGHT || next_ball_y < 0) {
                IO.println("Ball Ceiling coll...");
                ball.vel_y *= -1;

            }

            ball.render(gui);
        }

        // TODO: e) Kollisionen zwischen Ball und Players und
        //  zwischen Ball und Seitenwänden abfangen, Punkte zählen

        // TODO: b) Spieler, Ball und später Punktestand zeichnen
        // Beispiel-Aufrufe:
        /*gui.fillRect(20, 50, 10, 100);
        gui.fillCircle(100, 100, 5);*/

        String score_text = player_1.points + "/" + player_2.points;
        gui.setFontSize(20);
        double score_text_width = gui.stringWidth(score_text);
        gui.drawString(score_text, WIDTH/2 - score_text_width/2, 40);

        gui.refreshAndClear(20); // waits 20 ms, so 50 fps
    }
}
